package Exemploaula06;

import java.util.Scanner;

import poo.Pessoa;

public class programa_depe {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Pessoa[] listaPessoas = new Pessoa[10];
		
		boolean possuiDep;
		
		String resp;
		
		for(int i=0; i<=2; i++) {
			Pessoa p = new Pessoa();
			
			System.out.print("Digite o id: ");
			p.id = ler.nextInt();
			
			System.out.print("Digite o nome: ");
			p.nome = ler.next();
			
			System.out.print("Voce possui dependente? S/N ");
			resp = ler.next();
			
			if(resp.equals("s"))
				possuiDep = true;
			else
				possuiDep = false;
			
			
			
			if(possuiDep) {
				dependente d = new dependente();
				
				System.out.print("Digite o nome do dependente: ");
				d.nome = ler.next();
				
				System.out.print("Digite a idade do dependente: ");
				d.idade = ler.nextInt();
				
				p.dep = d;
			}
			else {
				p.dep = null;
			}
			
			listaPessoas[i] = p;
			
		}
		
		for(int i=0; i<=2; i++) {
			//System.out.println("id: " + listaPessoas[i].id + " - Nome: " + listaPessoas[i].nome);
			System.out.println(listaPessoas[i].exibirIdNome());
			
			if(listaPessoas[i].dep != null)
				//System.out.println("Dependente: " + listaPessoas[i].dep.nome + " - idade: " + listaPessoas[i].dep.idade);
				System.out.println(listaPessoas[i].exibirDependente());
		}
	}

}
