package Ex63;

public class PessoaJuridica extends Pessoa{
	private String CNPJ;
	   
    public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public PessoaJuridica() {
    	
    }
   
	public PessoaJuridica(int id, String nome, String email, String cnpj) {
		super();
		this.CNPJ = cnpj;
	}



}
