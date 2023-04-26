package javadbex;

public class Aluno {
    private int id;
    private String nome;
    private String ra;
    private String curso;
    public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


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


    public String getRa() {
        return ra;
    }


    public void setRa(String ra) {
        this.ra = ra;
    }
   
    Aluno(){
       
    }
   
    Aluno(String nome, String ra){
        this.nome = nome;
        this.ra = ra;
    }
}

