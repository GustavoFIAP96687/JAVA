package Ex63;

public class PessoaFisica extends Pessoa{
	private String CPF;

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PessoaFisica(int id, String nome, String email, String cpf) {
		super();
		this.CPF = cpf;
	}

}
