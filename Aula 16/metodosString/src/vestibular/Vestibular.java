package vestibular;
import java.util.HashMap;

public class Vestibular {
    public static void main(String[] args) {
        String alunosVestibular = "Jose dos Santos,7,Sao Paulo;Sandra Silva,6.5,Sao Jose do Rio Preto;Augusto Soares,8,Sao Paulo;Vanderlei Azevedo,5.65,Santos;Vanessa Ferreira,9,Sao Paulo;Natan Cruz,10,Sao Paulo.";

        HashMap<String, Candidato> candidatos = new HashMap<String, Candidato>();

        String[] linhas = alunosVestibular.split(";");

        for (String linha : linhas) {
            String[] campos = linha.split(",");
            String nome = campos[0];
            double nota = Double.parseDouble(campos[1]);
            String cidade = campos[2];

            if (nota >= 7) {
                Candidato candidato = new Candidato(nome, nota, cidade);
                candidatos.put(nome, candidato);
            }
        }

        for (Candidato candidato : candidatos.values()) {
            System.out.println("Nome: " + candidato.nome);
            System.out.println("Nota: " + candidato.nota);
            System.out.println("Cidade: " + candidato.cidade);
            System.out.println();
        }
    }
}

class Candidato {
    String nome;
    double nota;
    String cidade;

    Candidato(String nome, double nota, String cidade) {
        this.nome = nome;
        this.nota = nota;
        this.cidade = cidade;
    }
}
