package atividade;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner k = new Scanner (System.in);
		 
		System.out.println ("insira um número");
		int a = k.nextInt ();
		
		if (a % 2 ==0 ) {
			System.out.println ("Esse número é par ");
		} else {
			System.out.println ("Esse número é impar ");
		}
	
	}

}
