package condicionais;

import java.util.Scanner;

public class Exe17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int a, b, c, d;
		
		System.out.print("Digite o primeiro numero: ");
		a = sc.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		b = sc.nextInt();
		
		System.out.print("Digite o terceiro numero: ");
		c = sc.nextInt();
		
		System.out.print("Digite o quarto numero: ");
		d = sc.nextInt();
		
		
		if ( b > c && d > a && c+d > a+b && c >=0 && d >= 0 && a%2 == 0) {
			System.out.println("Valores aceitos");
		}
		
		else {
			System.out.println("Valores não aceitos");
		}
		

	}

}
