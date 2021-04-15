package exeSwitch;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	    
	    System.out.print("digite um numero de 1 a 7 para saber a qual dia da semana ele corresponde: ");
	    int dia = sc.nextInt();
	   
	   
	   switch (dia) {
	      case 1 : 
		     System.out.println("Domingo fim de semana");
	         break ;
	      case 2 :
		     System.out.println("Segunda-feira dia util");
		     break ;		 
	      case 3 :
		     System.out.println("Terça-feira dia util");
	         break ;	   
	      case 4 :
		     System.out.println("Quarta-feira dia util");
		     break ;		
	      case 5 :
		     System.out.println("Quinta-feira dia util");
		  break ;		
	      case 6 :
		     System.out.println("Sexta-feira dia util");
		     break ;		
	     case 7 :
		    System.out.println("Sabado fim de semana");
		    break ;		
		 default:
			System.out.println("Numero invalido");
	   
	   }
	    

	}

}
