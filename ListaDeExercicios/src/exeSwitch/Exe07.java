package exeSwitch;

import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int idade, v;
		
		System.out.print("Digite a sua idade: ");
		idade = sc.nextInt();
		
		if ( idade < 10) {
			System.out.println("Valor total a ser pago: R$" + (100+80));		
		}
		
		else if (idade >= 10 && idade <= 30) {
			System.out.println("Valor total a ser pago: R$" + (100+50));
		}
		
		else if (idade >= 31 && idade < 60) {
			System.out.println("Valor total a ser pago: R$" + (100+95)); 
		}
			
		else if ( idade >= 60) {
			System.out.println("Valor total a ser pago: R$" + (100+130));
		}
		
		else {
			System.out.println("idade invalida");
		}
		
		
		
		
	}

}
