package banco;
import java.util.HashMap;
import java.util.*;

public class Programa {

	public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<String, String>();
	
	HashMap<String, Integer> map2 = new HashMap<String, Integer>();
	
	Cliente c = new Cliente();
	
	Scanner ler = new Scanner(System.in);
	
	String nome;
	int idade;
	String email;
	String r;
	String agencia;
	
	System.out.println("Digite Seu nome: ");
	nome = ler.next();
	c.setNome(nome);
	map.put("Nome: ", c.getNome());
	
	System.out.println("Digite Sua idade: ");
	idade = ler.nextInt();
	c.setIdade(idade);
	map2.put("idade: ", c.getIdade());
	
	System.out.println("Digite Seu email: ");
	email = ler.next();
	c.setEmail(email);
	map.put("Nome: ", c.getEmail());
	
	for (HashMap.Entry<String, String> m : map.entrySet()) {
		 
        System.out.println(m.getKey() + " = " + m.getValue());
    }

	
	/*
	 * System.out.println("Tem conta bancaria: "); r = ler.next();
	 * 
	 * if (r == "s") { ContaBancaria conta = new ContaBancaria();
	 * 
	 * System.out.println("Digite Sua agencia: "); agencia = ler.next();
	 * conta.setAgencia(agencia); map.put("Nome: ", c.getNome()); }else {
	 * System.out.println("Fim do programa"); }
	 */

		

	}

}
