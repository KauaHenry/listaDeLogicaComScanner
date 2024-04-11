package atividade;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {

		Scanner k = new Scanner (System.in);
		int soma = 0;
		System.out.println ("Quantos números você vai colocar?");
		int quan = k.nextInt();
		
		for (int i=0; i < quan; i++ ) {
			System.out.println ("insira um número");
			int a = k.nextInt();
			soma += a; 
					
	}
		System.out.println ("Média = " + (soma/quan));
}
}
