package entrada_saida_processamento;
import java.util.Scanner;


public class Ex36 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x, a, b;
		
		System.out.printf("digite um valor");
		x = ler.nextInt();
		
		while(x < 0) {
			System.out.printf("insira um valor positivo: ");
			x = ler.nextInt();
		}

	}

}