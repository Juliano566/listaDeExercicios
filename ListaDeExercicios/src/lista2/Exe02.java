import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero positivo: ");
		int n = sc.nextInt();
		int n1 = 0;
		int soma = 0;
		
		if (n >= 0) {
			while(n1 < n) {
				n1 = n1+1;							
			
				soma = n1+soma;
			}
			
			
		}
		else {
			System.err.println("numero invalido");
		}

		System.out.println("Soma de todos os numero inteiros de 1 a " + n + " = " + soma);
		
	}

}
