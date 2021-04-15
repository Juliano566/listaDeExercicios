package condicionais;

import java.util.Scanner;

public class Exe05 {


	public static void main(String[] args) {
		 
       Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o numero: ");
        double numero = sc.nextDouble();
        
        System.out.println("O valor do quadrado de "+numero+" é "+Math.pow(numero, 2));

	}

}
