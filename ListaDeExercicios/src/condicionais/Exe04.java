package condicionais;

import java.util.Scanner;

public class Exe04 {


	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
	        
	        int n1, n2;
	        
	        System.out.print("Digite o primeiro numero: ");
	        n1 = sc.nextInt();
	        
	        System.out.print("Digite o segundo numero: ");
	        n2 = sc.nextInt();
	        
	        System.out.println("O consecutivo de "+n1+" é "+(n1+1));
	        System.out.println("O consecutivo de "+n2+" é "+(n2+1));

	}

}
