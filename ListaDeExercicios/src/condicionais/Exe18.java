package condicionais;

import java.util.Scanner;

public class Exe18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, a, b, c;
		
		
		System.out.print("Digite o primeiro lado do tri�ngulo: ");
		n1 = sc.nextDouble();
		
		System.out.print("Digite o segundo lado do tri�ngulo: ");
		n2 = sc.nextDouble();
		
		System.out.print("Digite o terceiro lado do tri�ngulo: ");
		n3 = sc.nextDouble();
		
		if (n1 >= n2 && n1 >= n3 && n2 >= n3) {
			a = n1;
			b = n2;
			c = n3;
		}
		
		else if (n1 >= n2 && n1 >= n3 && n3 >= n2 ) {
			a = n1;
			b = n3;
			c = n2;
		}
			
		else if (n2 >= n1 && n2 >= n3 && n1 >= n3) {
			a = n2;
			b = n1;
			c = n3;
		}
			
		else if (n2 >= n1 && n2 >= n3 && n3 >= n1) {
			a = n2;
			b = n3;
			c = n1;
		}
			
		else if (n3 >= n1 && n3 >= n2 && n1 >= n2) {
			a = n3;
			b = n1;
			c = n2;
		}
			
		else {
			a = n3;
			b = n2;
			c = n1;
		}
			
			
		if (a >= b+c) {
			System.out.println("N�o forma tri�ngulo");
		}
		
		else {
		
	    if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("Tri�ngulo retangulo");
		}

		if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("Tri�ngulo obtusangulo");
		}
		
		if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("Tri�ngulo acutangulo");
		}
		
		if (a == b && a == c) {
			System.out.println("Tri�ngulo equilatero");
		}
		
		if ( a == b && a != c) {
			System.out.println("Tri�ngulo isosceles");
		}
		
		if (a == c && a != b) {
			System.out.println("Tri�ngulo isosceles");
		}
			
		else if (b == c && b != a) {
			System.out.println("Tri�ngulo isosceles");
		}
		
		}
		
	}

}
