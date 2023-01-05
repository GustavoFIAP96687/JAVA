package poo;

import java.util.Scanner;

public class programa_aluno {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		aluno[] listaaluno = new aluno[2];
		
		
		for(int i=0; i<=2; i++) {
			aluno a = new aluno();
			
			
			System.out.println("Digite o ra: ");
			a.ra = ler.next();
			
			System.out.println("Digite a nome: ");
			a.nome = ler.next();
			
			listaaluno[i] = a;
			
			String[] siglamateria = new String[2];
			
			for(int m=0; m<=2; m++) {
			
			System.out.println("Digite as materias: ");
			siglamateria[m] = ler.next();
			
			a.materias = siglamateria;
			
			System.out.println("Digite o periodo: ");
			a.periodo = ler.next();
			
			
			if((a.periodo.equals("noite"))) {
				System.out.println(a.nome);
			}
			
			}
		}
		
		

	}

}
