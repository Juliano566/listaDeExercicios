package exeSwitch;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String mes;
		
		System.out.print("Digite o mes: ");
		mes = sc.next();
		
		switch (mes) {
		   case "janeiro" :
		   case " fevereiro" :
		   case "junho" :
		   case "julho" :
		   case "dezembro" :
			   System.out.println("alta temporada");
		       break;
		   case "março" :
		   case "abril" :
		   case "maio" :
		   case "agosto" :
		   case "setembro" :
		   case "novembro" :
			   System.out.println("baixa temporada");
		       break;
		default :
               System.out.println("mes invalido");			
		}
		
		
		
	}

}
