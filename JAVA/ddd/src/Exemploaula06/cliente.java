package Exemploaula06;

public class cliente {
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public contaBancaria getCb() {
		return cb;
	}

	public void setCb(contaBancaria cb) {
		this.cb = cb;
	}

	private int id;
	private String nome;
	private int idade;
	private String email;
	private contaBancaria cb;
	
	public cliente() {
		
	}
	
	public cliente(int id, String nome, int idade, String email, contaBancaria conta) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.cb = conta;
	}
	
	public String exibirNomeIdade() {
		return "Nome: " + this.nome + " idade :" + this.idade;
	}
	
	public String exibirDadosConta() {
		return "Agencia: " + this.cb.getAgencia() + "Numero: " + this.cb.getNumero() + "Saldo: " + this.cb.getSaldo();
	}
	
}
