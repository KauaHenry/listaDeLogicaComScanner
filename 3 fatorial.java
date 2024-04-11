package atividade;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		int fat = 1;
		Scanner k = new Scanner (System.in);
		 
		System.out.println ("insira um número");
		int a = k.nextInt ();
		
		for (int i=1; i <= a; i++ ) {
			fat *= i;
		}
		
		System.out.println (a + " fatorial é igual a: " +fat);
		
	}
}
