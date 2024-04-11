package atividade;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
	Scanner x = new Scanner (System.in);
	
	System.out.println ("insira um número ");
	int a = x.nextInt();
	
	System.out.println ("insira outro valor ");
	int b = x.nextInt();
	
	System.out.println ("A Soma de " + a + " + " + b + " é igual a " + (a+b)); 
	
	}

}
