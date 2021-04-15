package condicionais;

import java.util.Scanner;

public class Exe02 {


	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
        
        double n1, n2;
        
        System.out.print("Digite a base: ");
        n1 = sc.nextDouble();
        
        System.out.print("Digite o expoente: ");
        n2 = sc.nextDouble();
        
        System.out.println("A potencia do numero é: " + Math.pow(n1, n2));

	}

}
