package condicionais;

import java.util.Scanner;

public class Exe03 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
        int n1 , n2;
        
        System.out.print("Digite o primeiro numero: ");
        n1 = sc.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        n2 = sc.nextInt();
        
        System.out.println("A soma dos quadrados dos dois numeros é: " +((n1*n1)+(n2*n2)));

	}

}
