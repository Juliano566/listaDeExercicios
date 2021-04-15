package condicionais;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        
	        double n1, n2;
	        
	        System.out.print("Digite o primeiro numero: ");
	        n1 = sc.nextDouble();
	        
	        System.out.print("Digite o segundo numero: ");
	        n2 = sc.nextDouble();
	        
	        System.out.println("O valor do produto é: " + n1*n2);

	}

}
