package exeSwitch;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		 
		System.out.print("Digite o numero: ");
		n = sc.nextInt();
		  		  
		 m = n % 3;
		  
		  switch (m) {
		     case 0 :
		    	 System.out.println(n + " divisivel por 3");
	         break;
	         default :
	        	 System.out.println(n + " não divisivel por 3");
		  }
		
		

	}

}
