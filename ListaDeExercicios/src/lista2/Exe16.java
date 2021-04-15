import java.util.Scanner;

public class Exe16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		
		int n, v;
		int i = 1;
		
		System.out.println("Digite a quantidade de numeros: ");
		n = sc.nextInt();
		
		do {
			System.out.println(i + "°" + " numero: ");
		    v = sc.nextInt();
		   
			if(v > 0 && v%2 == 0) {
		    	System.out.println("Numero positivo");
		        System.out.println("Numero par");   
		    }
		    else if(v > 0 && v%2 != 0) {
		    	System.out.println("Numero positivo");
		    	System.out.println("Numero impar");
		    }
		    else if(v < 0 && v%2 == 0) {
		    	System.out.println("Numero negativo");
		    	System.out.println("Numero par");
		    }
		    else if(v < 0 && v%2 != 0) {
		    	System.out.println("Numero negativo");
		    	System.out.println("Numero impar");
		    }
		    else if (v == 0) {
		    	System.out.println("Nulo");
		    }
		
			i++;
		
		}while(i <= n);
		
		
		
		
		
		
		

	}

}
