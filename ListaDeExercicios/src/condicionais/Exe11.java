package condicionais;

import java.util.Scanner;

public class Exe11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numero;
		
		System.out.print("Digite o numero: ");
		numero = sc.nextDouble();
		
		if(numero >= 0) {
			System.out.println("Numero positivo");
		}
 
		else {
			System.out.println("numero negativo");
		}
		
		
	}

}
