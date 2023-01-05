package poo;

import java.util.Scanner;

public class programa_cliente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		cliente[] listacliente = new cliente[5];
		
		
		for(int i=0; i<=5; i++) {
			cliente c = new cliente();
			
			System.out.println("Digite o id: ");
			c.id = ler.nextInt();
			
			System.out.println("Digite a idade: ");
			c.idade = ler.nextInt();
			
			System.out.println("Digite o nome: ");
			c.nome = ler.next();
			
			System.out.println("Digite o E-mail: ");
			c.email = ler.next();
			
			listacliente[i] = c;
			
			if(listacliente[i].idade > 18) {
				System.out.println(listacliente[i].idade);
			

			}
		}
	}
}

