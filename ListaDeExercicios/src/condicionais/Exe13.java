package condicionais;

import java.util.Scanner;

public class Exe13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        double n1, n2, n3;
		
		System.out.print("Digite o primeiro numero: ");
		n1 = sc.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		n2 = sc.nextDouble();
		
		System.out.print("Digite o terceiro numero: ");
		n3 = sc.nextDouble();
		
		if (n1 >= n2 && n1 >= n3) {
			System.out.println(n1+" é o maior numero");
		}
		else if (n2 >= n1 && n2 >= n3) {
			System.out.println(n2+" é o maior numero");
		}
		else {
			System.out.println(n3+" é o maior numero");
		}

	}

}
