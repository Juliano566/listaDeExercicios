package condicionais;

import java.util.Scanner;

public class Exe15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta, r1, r2;
		
		System.out.print("Digite o primeiro numero: ");
		a = sc.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		b = sc.nextDouble();
		
		System.out.print("Digite o terceiro numero: ");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2) - 4 * a * c;
		
		if (delta < 0 || a == 0) {
			System.out.println("Impossivel calcular");
		}
		else {
			r1 = (-b + Math.sqrt(delta)) / (2*a);			
			System.out.printf("r1 = %.3f%n", r1);
			
			r2 = (-b - Math.sqrt(delta)) / (2*a);			
			System.out.printf("r2 = %.3f%n", r2);		
		}
		
		
	}

}
