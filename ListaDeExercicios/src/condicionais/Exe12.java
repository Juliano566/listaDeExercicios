package condicionais;

import java.util.Scanner;

public class Exe12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double l, r;
		
		System.out.print("Digite o numero para calcular a area do quadrado: ");
		l = sc.nextDouble();
		
		System.out.print("Digite o numero para calcular a area do circulo: ");
		r = sc.nextDouble();
		
		l = Math.pow(l, 2);		
		r = (3.14159*(Math.pow(r, 2)));
		
		if (l > r) {
			System.out.println("Area do quadrado maior que area do circulo");
		}
		else {
			System.out.println("Area do circulo maior que area do quadrado");
		}


	}

}
