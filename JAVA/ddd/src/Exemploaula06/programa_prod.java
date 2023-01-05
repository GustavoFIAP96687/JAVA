package Exemploaula06;

import java.util.*;

public class programa_prod {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		produto[] listaProd = new produto[2];
	
		
		boolean possuiCg;
		
		String veri;
		
		for (int i=0; i<=1; i++) {
			produto p = new produto();
			
			System.out.printf("Digite o id da pessoa: ");
			p.setId(ler.nextInt());
            
			System.out.printf("Digite o nome: ");
            p.setNome(ler.next());
            
			System.out.printf("Digite o preço: ");
            p.setPreco(ler.nextDouble());
            
			System.out.printf("Digite a quantidade: ");
            p.setQtd(ler.nextDouble());
            
			System.out.printf("tem categoria? s/n: ");
            veri = ler.next();
            
    		if(veri.equals("s"))
    			possuiCg = true;
			else
				possuiCg = false;
    		
    		
    		if(possuiCg) {
				categoria a = new categoria();
				
				System.out.print("Digite o id : ");
				a.setId(ler.nextInt());
				
				System.out.print("Digite o nome: ");
				a.setNome(ler.next());
				
				p.setCg(a);
    		}
    		else {
    			p.setCg(null);
			}
    		listaProd[i] = p;
		}
		
		for (int i=0; i<=1; i++) {
			System.out.println(listaProd[i].ExibirNomePreco());
			
			if(listaProd[i] != null)
				System.out.println(listaProd[i].ExibirNomeQtd());
		}

	}

}
