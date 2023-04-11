package vestibular;
import java.util.ArrayList;

public class Clientes {
    public static void main(String[] args) {
        String baseDados = "CJose dos Santos,42,Sao Paulo;CSandra Silva,36,Sao Jose do Rio Preto;CAugusto Soares,22,Sao Paulo;CVanderlei Azevedo,45,Santos;CVanessa Ferreira,27,Sao Paulo;PMouse,1,9.90;PTeclado,3,19.90;PMonitor,2,349.90;PHD SSD,2,199.90;PProcessador,1,350.00";
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();

        String[] registros = baseDados.split(";");

        for (String registro : registros) {
            String[] campos = registro.split(",");

            if (campos[0].charAt(0) == 'C') {
                Cliente cliente = new Cliente(campos[0].substring(1), Integer.parseInt(campos[1]), campos[2]);
                clientes.add(cliente);
            } else if (campos[0].charAt(0) == 'P') {
                Produto produto = new Produto(campos[0].substring(1), Integer.parseInt(campos[1]), Double.parseDouble(campos[2]));
                produtos.add(produto);
            }
        }

        System.out.println("Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("Cidade: " + cliente.getCidade());
            System.out.println();
        }

        System.out.println("Produtos:");
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Qtd em estoque: " + produto.getQuantidadeEstoque());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println();
        }
    }
}

class Cliente {
    private String nome;
    private int idade;
    private String cidade;

    public Cliente(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }
}

class Produto {
    private String nome;
    private int quantidadeEstoque;
    private double preco;

    public Produto(String nome, int quantidadeEstoque, double preco) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }
}

