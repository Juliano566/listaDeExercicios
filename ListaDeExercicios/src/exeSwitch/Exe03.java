package exeSwitch;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int v;
		int nota100 = 100;
		int nota50  = 50;
		int nota10  = 10;
		int nota5   = 5;
		int nota1   = 1;
				
		
		System.out.print("Digite o valor: R$");
		v = sc.nextInt();
		
		if (v > 0) {
			 nota100 = v / 100;
	            v = v % 100;

	            nota50 = v / 50;
	            v = v % 50;

	            nota10 = v / 10;
	            v = v % 10;

	            nota5 = v / 5;
	            v = v % 5;

	            nota1 = v / 1;
	            v = v % 1;
	        } else {
	            System.out.println("Valor inválido");
		}
		
		 if (nota100 > 0) {
	            System.out.println(nota100 + " nota(s) de R$100");
	        }
	        if (nota50 > 0) {
	            System.out.println(nota50 + " nota(s) de R$50");
	        }
	        if (nota10 > 0) {
	            System.out.println(nota10 + " nota(s) de R$10");
	        }
	        if (nota5 > 0) {
	            System.out.println(nota5 + " nota(s) de R$5");
	        }
	        if (nota1 > 0) {
	            System.out.println(nota1 + " nota(s) de R$1");
	        }
		
		
	}

}
