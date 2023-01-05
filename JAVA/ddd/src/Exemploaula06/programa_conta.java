package Exemploaula06;

import java.util.Scanner;

public class programa_conta {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		cliente[]  listaCliente = new cliente[5];
		
		 int id;
		 String nome;
		 int idade;
		 String email;
		 contaBancaria cb;
		
		boolean possuiCb;
		
		String veri;
		
		for(int i = 0; i<=1; i++) {
			cliente c = new cliente();
			
			System.out.print("Digite o id: ");
			id = ler.nextInt();
			c.setId(id);
			
			System.out.print("Digite o nome: ");
			nome = ler.next();
			c.setNome(nome);
			
			System.out.print("Digite a idade: ");
			idade = ler.nextInt();
			c.setIdade(idade);
			
			System.out.print("Digite o email: ");
			email = ler.next();
			c.setEmail(email);
			
			System.out.print("tem conta? S/N ");
			veri = ler.next();
			
			if(veri.equals("s"))
				possuiCb = true;
			else
				possuiCb = false;
			
			
			if(possuiCb) {
				contaBancaria b = new contaBancaria();
				
				System.out.print("Digite a conta: ");
				b.setAgencia(ler.next());
				
				System.out.print("Digite o numero da conta: ");
				b.setNumero(ler.next());
				
				System.out.print("Digite o saldo: ");
				b.setSaldo(ler.nextDouble());
				
				c.setCb(b);
			}
			else {
				c.setCb(null);
			}
			
			listaCliente[i] = c;
			
		}
		
		for(int i = 0; i<=1; i++) {
			System.out.println(listaCliente[i].exibirNomeIdade());
			
			if(listaCliente[i] != null) {
				System.out.println(listaCliente[i].exibirDadosConta());
			}
		}

	}

}
