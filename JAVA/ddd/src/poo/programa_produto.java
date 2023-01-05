package poo;

import java.util.Scanner;

public class programa_produto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		produto[] listaproduto = new produto[10];
		
		for(int i=0; i<=5; i++) {
			produto prod = new produto();
			
			System.out.println("Digite o id: ");
			prod.id = ler.nextInt();
			
			System.out.println("Digite a idade: ");
			prod.descricao = ler.next();
			
			System.out.println("Digite o nome: ");
			prod.valor = ler.nextDouble();
			
			System.out.println("Digite o E-mail: ");
			prod.quantidade = ler.nextDouble();
			
			listaproduto[i] = prod;
			
			if(listaproduto[i].valor < 100.00) {
				System.out.println(listaproduto[i].valor);
			}
			
		}

		}
	}
