package bancoherança;

public class ContaPoupanca extends ContaBancaria{
    private double rentabilidade;


    public double getRentabilidade() {
        return rentabilidade;
    }


    public void setRentabilidade(double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }
   
    public ContaPoupanca() {
    }
   
    public ContaPoupanca(String agencia, String numero, double saldo, double rentabilidade) {
        super(agencia, numero, saldo);
       
        this.rentabilidade = rentabilidade;
    }
}

