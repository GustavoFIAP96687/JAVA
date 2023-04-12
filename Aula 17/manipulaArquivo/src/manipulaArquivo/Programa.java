package manipulaArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produto> listaCompras = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o nome do produto %d: ", i);
            String nome = sc.nextLine();

            System.out.printf("Digite a quantidade do produto %d: ", i);
            int quantidade = sc.nextInt();
            sc.nextLine();

            System.out.printf("Digite o preço unitário do produto %d: ", i);
            double preco = sc.nextDouble();
            sc.nextLine();

            Produto produto = new Produto(nome, quantidade, preco);
            listaCompras.add(produto);
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("lista.txt"));

            for (Produto produto : listaCompras) {
                bw.write(produto.toString());
                bw.newLine();
            }

            bw.close();
            System.out.println("Lista de compras salva com sucesso no arquivo lista.txt.");
        } catch (IOException e) {
            System.out.println("Erro ao gravar a lista de compras no arquivo.");
            e.printStackTrace();
        }

        sc.close();
    }
}
