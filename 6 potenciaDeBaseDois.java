package atividade;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {

		Scanner k = new Scanner (System.in);
		
		System.out.println ("Insira um número ");
		double num = k.nextInt();
		double a;
		
		while ( num != 1) {
			a = num/2;
			num = a;
			if ( num == 1) {
				break;
			}else if (num < 1) {
				break;
			}
		}
			
		if ( num == 1) {
			System.out.println ("É potência de base 2");
		}else if (num < 1) {
			System.out.println ("Não é potência de base 2");
		}
		
	}
}
