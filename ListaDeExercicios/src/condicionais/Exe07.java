package condicionais;

import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double a, b;
		
		System.out.print("Didige o primeiro lado: ");
		a = sc.nextInt();
		
		System.out.print("Digite o segundo lado: ");
		b = sc.nextInt();
		
		a = Math.pow(a, 2);
		b = Math.pow(b, 2);
		
		a = a + b;
		
		System.out.printf("A hipotenusa do triângulo retângulo é: %.2f" , Math.sqrt(a));
		
		
		
	}

}
