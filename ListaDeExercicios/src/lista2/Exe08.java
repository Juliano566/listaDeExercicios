
public class Exe08 {

	public static void main(String[] args) {
		
		
		int n = 12;
		double soma = 0;
		int n2 = 0;
		
		
		while(n <= 70) {
			n = n+2;
			soma = n+soma;
            n2++;
			
		}
		
       System.out.println("Media dos numeros pares de 13 a 73: " + soma/n2);
		
		
	}

}
