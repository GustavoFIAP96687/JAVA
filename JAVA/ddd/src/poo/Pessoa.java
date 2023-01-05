package poo;

public class Pessoa {
    public int id;
    public String nome;
   
    Pessoa(){
       
    }
   
    Pessoa(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
   
    public void transformarNomeMaiusculo() {
        this.nome = this.nome.toUpperCase();
    }
   
    public void mudarNome(String novoNome) {
        this.nome = novoNome;
        
        

    }
}

