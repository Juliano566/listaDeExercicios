package exeSwitch;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o ano: ");
		int a = sc.nextInt();

		System.out.print("Digite o mes: ");
		String m = sc.next();
		
		if (a % 4 == 0) {
		
		switch (m) {
		   case "janeiro" :
			  System.out.println(m + " 31 dias");
		      break;
		   case "fevereiro" :
			   System.out.println(m + " 29 dias");
			   break;
		   case "março" :
			   System.out.println(m + " 31 dias");
			   break;
		   case "abril" :
			   System.out.println(m + " 30 dias");
			   break;
		   case "maio" :
			   System.out.println(m + " 31 dias");
			   break;
		   case "junho" :
			   System.out.println(m + " 30 dias");
			   break;
		   case "julho" :
			   System.out.println(m + " 31 dias");
			   break;
		   case "agosto" :
			   System.out.println(m + " 31 dias");
			   break;
		   case "setembro" :
			   System.out.println(m + " 30 dias");
			   break;
		   case "outubro" :
			   System.out.println(m + " 31 dias");
			   break;
		   case "novembro" :
			   System.out.println(m + " 30 dias");
			   break;
		   case "dezembro" :
			   System.out.println(m + " 31 dias");
			   break;
		       }
		}
		
		 else {
			  
			  switch (m) {
			   case "janeiro" :
				  System.out.println(m + " 31 dias");
			      break;
			   case "fevereiro" :
				   System.out.println(m + " 28 dias");
				   break;
			   case "março" :
				   System.out.println(m + " 31 dias");
				   break;
			   case "abril" :
				   System.out.println(m + " 30 dias");
				   break;
			   case "maio" :
				   System.out.println(m + " 31 dias");
				   break;
			   case "junho" :
				   System.out.println(m + " 30 dias");
				   break;
			   case "julho" :
				   System.out.println(m + " 31 dias");
				   break;
			   case "agosto" :
				   System.out.println(m + " 31 dias");
				   break;
			   case "setembro" :
				   System.out.println(m + " 30 dias");
				   break;
			   case "outubro" :
				   System.out.println(m + " 31 dias");
				   break;
			   case "novembro" :
				   System.out.println(m + " 30 dias");
				   break;
			   case "dezembro" :
				   System.out.println(m + " 31 dias");
				   break;
				   }
		
		}
		
		
		
	}

}
