package bancoherança;

public class ContaBancaria {
    private String agencia;
    private String numero;
    private double saldo;
   
    ContaBancaria(){
       
    }
   
    ContaBancaria(String agencia, String numero, double saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

   public String getAgencia() {
        return agencia;
    }

   public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

   public String getNumero() {
        return numero;
    }

   public void setNumero(String numero) {
        this.numero = numero;
    }
   
   public double getSaldo() {
        return saldo;
    }

   public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
   public void Depositar(double valor) {
       this.saldo += valor;
   }
   
   public void Sacar(double valor) {
       this.saldo -= valor;
   }

}