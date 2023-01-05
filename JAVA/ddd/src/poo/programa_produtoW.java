package poo;

import java.util.Scanner;

public class programa_produtoW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		produto[] listacliente = new produto[10];
		int i;
		
		i = 0;
		
		while(i < 10) {
			produto prod = new produto();
			
			System.out.println("Digite o id: ");
			prod.id = ler.nextInt();
			
			System.out.println("Digite a idade: ");
			prod.descricao = ler.next();
			
			System.out.println("Digite o nome: ");
			prod.valor = ler.nextDouble();
			
			System.out.println("Digite o E-mail: ");
			prod.quantidade = ler.nextDouble();
			
			listacliente[i] = prod;
			i++;
		}

		
		i = 0;
			
		while(i<10) {
			if(listacliente[i].valor > 18) {
				System.out.println(listacliente[i].valor);
			}
			i++;
		}

	}

}
