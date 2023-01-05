package Checkpoint;

import java.util.*;

public class programa_aluno {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Aluno[] listaAluno = new Aluno[4];
		
		boolean possuiCurso;
		
		String verifica; 
		
		
		for(int i=0; i<=4; i++) {
			Aluno a = new Aluno();
			
			System.out.printf("Digite o seu ID: ");
			a.setId(ler.nextInt());
			
			System.out.printf("Digite o RM: ");
			a.setRm(ler.next());
			
			System.out.printf("Digite o seu nome: ");
			a.setNome(ler.next());
			
			System.out.printf("Voce esta fazendo algum curso? s/n: ");
			verifica = ler.next();
			
			if(verifica.equals("s"))
				possuiCurso = true;
			else
				possuiCurso = false;
			
			if(possuiCurso) {
				Curso c = new Curso();
				
				System.out.printf("Digite o ID do seu curso: ");
				c.setId(ler.nextInt());
				
				System.out.printf("Digite o nome do seu curso: ");
				c.setNome(ler.next());
				
				a.setCurso(c);
				
				
			}
			else {
				a.setCurso(null);
			}
			
			listaAluno[i] = a;
		}
		
		for(int i=0; i<=4; i++) {
			System.out.println(listaAluno[i].exibirAluno());
			
			if(listaAluno[i].getCurso() != null) {
				System.out.println(listaAluno[i].exibirCurso());
			}
		}

	}

}
