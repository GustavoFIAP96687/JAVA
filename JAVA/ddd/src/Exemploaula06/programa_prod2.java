package Exemploaula06;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class programa_prod2 {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
	       
        ArrayList<produto> listaProduto = new ArrayList<>();
        
        int opcao;
        int id_cliente;
        String possuiCg;
        int id;
        int indexProd;
        produto pro;
        
        
        do {        
            System.out.printf("===> Sistema de Cadastro de Clientes <===\n\n");
            System.out.printf("Escolha uma opção:\n");          
            System.out.printf("1 - Incluir \n" +
                              "2 - Atualizar \n" +
                              "3 - Excluir \n" +
                              "4 - Exibir \n" +
                              "5 - Sair\n\n");
            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();
            
            if (opcao == 1) {
                produto p = new produto();
                
                if(listaProduto.size() > 0) {
                    id_cliente = listaProduto.get(listaProduto.size()-1).getId() + 1;
                }
                else {
                    id_cliente = 1;
                }
                p.setId(id_cliente);
                
                p.setId(id_cliente);
                
                System.out.print("Digite o seu nome: ");
                p.setNome(ler.next());
                
                System.out.print("Digite a seu idade: ");
                p.setPreco(ler.nextDouble());
                
                System.out.print("Digite o seu e-mail: ");
                p.setQtd(ler.nextDouble());
                
                System.out.print("Possui conta bancária? S/N");
                possuiCg = ler.next().toUpperCase();
                
                if(possuiCg.equals("S")) {
                	categoria cg = new categoria();
                    
                    System.out.print("Digite a agencia: ");
                    cg.setId(ler.nextInt());
                    
                    System.out.print("Digite o numero: ");
                    cg.setNome(ler.next());
                    
                    p.setCg(cg);

                }
                else {
                	p.setCg(null);
                }
                listaProduto.add(p);
                
                System.out.printf("produto incluído com sucesso!");
                System.in.read();

            }
            
            else if(opcao == 2) {
            	for(produto prod: listaProduto) {
                    System.out.println(prod.ExibirNomePreco());
                }
            	System.out.print("Digite o ID do cliente que você deseja atualizar: ");
                id = ler.nextInt();
                
                indexProd = -1;
                for(produto prod: listaProduto) {
                    if (prod.getId() == id) {
                    	indexProd = listaProduto.indexOf(prod);
                        break;
                    }
                }

                
            }
            
        }while( (opcao >= 1) && (opcao <= 4) );

     }    
  }



