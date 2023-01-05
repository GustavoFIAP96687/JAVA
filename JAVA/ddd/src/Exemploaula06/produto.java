package Exemploaula06;

public class produto {
	private int id;
	private String nome;
	private double preco;
	private double qtd;
	private categoria cg;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQtd() {
		return qtd;
	}

	public void setQtd(double qtd) {
		this.qtd = qtd;
	}

	public categoria getCg() {
		return cg;
	}

	public void setCg(categoria cg) {
		this.cg = cg;
	}
	
	public produto() {
		
	}
	
	public produto(int id, String nome, double preco, double qtd, categoria cg) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
		this.cg = cg;
	}
	
    public String ExibirNomePreco(){
    	return " Nome:" + this.nome + " Preço:" + this.preco + "Quantidade: " + this.qtd;
    }
	
    
    public String ExibirNomeQtd(){
    	return " Nome:" + this.nome + " quantidade:" + this.qtd;
    }
}
