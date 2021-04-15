package condicionais;

import java.util.Scanner;

public class Exe08 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double n1, n2, n3, n4;
		
		System.out.print("Digite o primeiro numero: ");
		n1 = sc.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		n2 = sc.nextDouble();
		
		System.out.print("Digite o terceiro numero: ");
		n3 = sc.nextDouble();
		
		System.out.print("Digite o quarto numero: ");
		n4 = sc.nextDouble();
		
		System.out.println("A média aritimética dos quatro numeros é: "+((n1+n2+n3+n4)/4));


	}

}
