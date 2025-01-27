package cp5;

import java.util.Scanner;
import java.io.*;

public class Programa {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String pedidosPath = "C:\\Users\\logonrmlocal\\Desktop\\pedidos.txt"; //Altere o caminho do arquivo para onde voce deseje que seja salvo.
        String totalPath = "C:\\Users\\logonrmlocal\\Desktop\\total_pedidos.txt"; //Altere o caminho do arquivo para onde voce deseje que seja salvo.
        boolean continua = true;

        try (BufferedWriter totalWriter = new BufferedWriter(new FileWriter(totalPath))) {
            while (continua) {
                try (BufferedReader pedidosReader = new BufferedReader(new FileReader(pedidosPath))) {
                    double totalPedido = 0;
                    String nomePessoa = "";
                    String linha;

                    System.out.println("Digite o seu nome: ");
                    nomePessoa = ler.next();

                    System.out.println("Qual a quantidade de produtos que você deseja cadastrar: ");
                    int qtdProduto = ler.nextInt();

                    for (int i = 0; i < qtdProduto; i++) {
                        Produto p = new Produto();

                        System.out.println("Digite o nome do produto " + (i + 1) + ": ");
                        p.setNome(ler.next());

                        System.out.println("Digite a quantidade do produto " + (i + 1) + ": ");
                        p.setQuantidade(ler.nextDouble());

                        System.out.println("Digite o preço do produto " + (i + 1) + ": ");
                        p.setPreco(ler.nextDouble());

                        totalPedido += p.getQuantidade() * p.getPreco();

                        linha = p.getNome() + "," + p.getQuantidade() + "," + p.getPreco() + "\n";
                        try (BufferedWriter pedidosWriter = new BufferedWriter(new FileWriter(pedidosPath, true))) {
                            pedidosWriter.write(nomePessoa + "\n");
                            pedidosWriter.write(linha);
                            pedidosWriter.newLine();
                        } catch (IOException e) {
                            System.out.print("Erro ao escrever no arquivo de pedidos - " + e);
                            break;
                        }
                    }

                    linha = nomePessoa + " - R$ " + String.format("%.2f", totalPedido);
                    totalWriter.write(linha);
                    totalWriter.newLine();

                    System.out.println("Deseja cadastrar um novo pedido? (sim ou nao)");
                    String resposta = ler.next();
                    if (resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s")) {
                        continua = true;
                    } else {
                        continua = false;
                    }
                } catch (IOException e) {
                    System.out.print("Erro ao ler o arquivo de pedidos - " + e);
                    break;
                }
            }
        } catch (IOException e) {
            System.out.print("Erro ao criar o arquivo de total de pedidos - " + e);
        }

        System.out.println("Programa encerrado.");
    }
}
