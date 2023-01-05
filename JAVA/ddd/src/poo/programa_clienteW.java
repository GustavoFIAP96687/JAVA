package poo;

import java.util.Scanner;

public class programa_clienteW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		cliente[] listacliente = new cliente[5];
		int i;
		
		i = 0;
		
		while(i < 5) {
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
			i++;
		}

		
		i = 0;
			
		while(i < 5) {
			if(listacliente[i].idade > 18) {
				System.out.println(listacliente[i].idade);
			}
			i++;
		}

	}

}
