package bancoherança;

public class ContaCorrente extends ContaBancaria{
    private double chequeEspecial;


    public double getChequeEspecial() {
        return chequeEspecial;
    }


    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
   
    public ContaCorrente() {
    }
   
    public ContaCorrente(String agencia, String numero, double salario, double chequeEspecial) {
        super(agencia, numero, salario);
       
        this.chequeEspecial = chequeEspecial;
    }
   
    public void Depositar(double valor) {
        super.Depositar(valor);
       
        valor = valor - 0.10;
        this.setSaldo(valor);
    }
    
    public void Sacar(double valor) {
        super.Sacar(valor);
       
        valor = valor - 0.10;
        this.setSaldo(valor);
    }
}
