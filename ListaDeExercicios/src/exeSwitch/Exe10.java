package exeSwitch;

import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2;
		
		char x;
		
		System.out.print("Qual o peração deseja realizer (+, - , *, /): ");
		x = sc.next().charAt(0);
		
		System.out.print("Digite o primeiro numero: ");
		n1 = sc.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		n2 = sc.nextDouble();
		
		
		
		switch (x) {
		   case '+' :
			   System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
			   break;
		   case '-' :
			   System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
			   break;
		   case '*' :
			   System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
			   break;
		   case '/' :
			   System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
	           break;	   
		   default :
			   System.out.println("Operação invalida");
		   
		}

		
		

	}

}
