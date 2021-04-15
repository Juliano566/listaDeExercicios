package condicionais;

import java.util.Scanner;

public class Exe14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        double n1, n2;
		
		System.out.print("Digite o primeiro numero: ");
		n1 = sc.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		n2 = sc.nextDouble();
		
		if (n1 >= n2) {
			System.out.println(n1+" dividido por "+n2+" = "+n1/n2);
		}
		else {
			System.out.println(n2+" dividido por "+n1+" = "+n2/n1);
		}
		

	}

}
