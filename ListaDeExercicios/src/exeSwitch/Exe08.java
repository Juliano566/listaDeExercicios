package exeSwitch;

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		String mes;
		double multa = 0 ;
		
		System.out.print("Digite o mes: ");
		mes = sc.next();
		
		System.out.print("Digite o valor da multa: R$");
		multa = sc.nextDouble();
		
		
		double  n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12;
		
		n1  = ((multa*5)/100) + multa;
		n2  = ((n1*5)/100) + n1;
		n3  = ((n2*5)/100) + n2;
		n4  = ((n3*5)/100) + n3;
		n5  = ((n4*5)/100) + n4;
		n6  = ((n5*5)/100) + n5;
		n7  = ((n6*5)/100) + n6;
		n8  = ((n7*5)/100) + n7;
		n9  = ((n8*5)/100) + n8;
		n10 = ((n9*5)/100) + n9;
		n11 = ((n10*5)/100)+ n10;
		n12 = ((n11*5)/100)+ n11;
		
		
		switch (mes) {
		   case "janeiro" :
			   System.out.printf("Valor total a ser pago: R$%.2f" , n1);
			   break;
		   case "fevereiro" :
			   System.out.printf("Valor total a ser pago: R$%.2f" , n2);
			   break;
		   case "março" :
			   System.out.printf("Valor total a ser pago: R$%.2f" , n3);
			   break;
		   case "abril" :
			   System.out.printf("Valor total a ser pago: R$%.2f" , n4);
			   break;
		   case "maio" :
			   System.out.printf("Valor total a ser pago: R$%.2f" , n5);
			   break;
		   case "junho" :
			   System.out.printf("Valor total a ser pago: R$%.2f" , n6);
			   break;
		   case "julho" :
			   System.out.printf("Valor total a ser pago: R$%.2f" , n7);
			   break;
		   case "agosto" :
			   System.out.printf("Valor total a ser pago: R$%.2f" , n8);
			   break;
		   case "setembro" :
			   System.out.printf("Valor total a ser pago: R$%.2f" , n9);
			   break;
		   case "outubro" :
			   System.out.printf("Valor total a ser pago: R$%.2f" , n10);
			   break;
		   case "novembro" :
			   System.out.printf("Valor total a ser pago: R$%.2f" , n11);
			   break;
		   case "dezembro" :
			   System.out.printf("Valor total a ser pago: R$%.2f" , n12);
			   break;
		   default :
		    	System.out.println("Mes invalido");   

		
		}

		
		
	}

}
