package javadbex;

import java.util.Scanner;
import java.sql.Connection;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		AlunoDBOracle db = new AlunoDBOracle();

		int opcao;
		int id;
		String nome;
		String curso;
		String ra;
		
		while(true) {
			 System.out.printf("Escolha uma opção:\n");
	            System.out.printf("1 - Incluir aluno \n" +
	                              "2 - Atualizar aluno \n" +
	                              "3 - Excluir aluno \n" +
	                              "4 - Listar alunos \n" +
	                              "5 - Sair\n\n");
	            System.out.printf("Digite a opção desejada: ");
	            opcao = ler.nextInt();
	            
	            
	            if (opcao == 1) {
	            	Aluno aluno = new Aluno();
	            	
	            	System.out.printf("\nDigite o id do aluno: ");
	                id = ler.nextInt();
	                aluno.setId(id);
	            	
	            	System.out.printf("\nDigite o nome do aluno: ");
	                nome = ler.next();
	                aluno.setNome(nome);
	                
	                System.out.printf("\nDigite o ra do aluno: ");
	                ra = ler.next();
	                aluno.setRa(ra);
	                
	                System.out.printf("\nDigite o curso do aluno: ");
	                curso = ler.next();
	                aluno.setCurso(curso);
	                
	                db.InserirAlunoDB(aluno);
	            	
	            }
	            else if(opcao == 2) {
	            	Aluno aluno = new Aluno();
	            	
	            	System.out.printf("\nDigite o id do aluno que vôce quer atualizar: ");
	                id = ler.nextInt();
	                aluno.setId(id);
	            	
	            	System.out.printf("\nDigite o nome do aluno: ");
	                nome = ler.next();
	                aluno.setNome(nome);
	                
	                System.out.printf("\nDigite o ra do aluno: ");
	                ra = ler.next();
	                aluno.setRa(ra);
	                
	                System.out.printf("\nDigite o curso do aluno: ");
	                curso = ler.next();
	                aluno.setCurso(curso);
	                
	                db.AtualizarAlunoDB(aluno);
	            }
	            else if(opcao == 3) {
	          
	            	System.out.printf("\nDigite o id do aluno: ");
	                id = ler.nextInt();
	                
	                db.ExcluirAlunoDB(id);
	            }
	            
	            else if(opcao == 4) {
	                
	                db.ListarAlunoDB();
	            }

			
		}

	}

}
