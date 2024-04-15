package atividade;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {

		Scanner k = new Scanner (System.in);
		
		System.out.println ("Qual o ano que você quer conferirir se é bissexto?");
		int ano = k.nextInt();
		
		if (ano % 4 == 0) {
			System.out.println (ano + " é bissexto");
		}else { System.out.println (ano + " não é bissexto");
		
		
		}
	}
}
