package exeSwitch;

import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int  n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11;
		double soma1, soma2;
		
		System.out.print("Digite o 1° numero do seu CPF: ");
		n1 = sc.nextInt();
		
		System.out.print("Digite o 2° numero do seu CPF: ");
		n2 = sc.nextInt();
		
		System.out.print("Digite o 3° numero do seu CPF: ");
		n3 = sc.nextInt();
		
		System.out.print("Digite o 4° numero do seu CPF: ");
		n4 = sc.nextInt();
		
		System.out.print("Digite o 5° numero do seu CPF: ");
		n5 = sc.nextInt();
		
		System.out.print("Digite o 6° numero do seu CPF: ");
		n6 = sc.nextInt();
		
		System.out.print("Digite o 7° numero do seu CPF: ");
		n7 = sc.nextInt();
		
		System.out.print("Digite o 8° numero do seu CPF: ");
		n8 = sc.nextInt();
		
		System.out.print("Digite o 9° numero do seu CPF: ");
		n9 = sc.nextInt();
		
		System.out.print("Digite o 10° numero do seu CPF: ");
		n10 = sc.nextInt();
		
		System.out.print("Digite o 11° numero do seu CPF: ");
		n11 = sc.nextInt();
		
		
		soma1 = (n1*10) + (n2*9) + (n3*8) + (n4*7) + (n5*6) + (n6*5) + (n7*4) + (n8*3) + (n9*2);
		
		soma1 = soma1 % 11;
		
		soma1 = 11 - soma1;
		
		if (soma1 < 10 ) {
			
			if (soma1 == n10) {
				
				soma2 = (n1*11) + (n2*10) + (n3*9) + (n4*8) + (n5*7) + (n6*6) + (n7*5) + (n8*4) + (n9*3) + (n10*2);
				
				soma2 = soma2 % 11;
				
				soma2 = 11 - soma2;
				
				
				if (soma2 < 10) {
					if (soma2 == n11) {
						System.out.println("CPF valido");
					}
				
					else {
						System.out.println("CPF Invalido");
					}
				
				}
				
				else {
					System.out.println("CPF invalido");
				}
										
			}
		
			else {
				System.out.println("CPF invalido");
			}
					
		}
		else {
				System.out.println("CPF invalido");
			}
			

		
		
		
	}

}
