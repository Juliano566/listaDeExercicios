import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
        
        int n;
        int s = 0;
        
        for(int i = 1; i <= 10; i++){
            
            System.out.print(i + "°" + "Numero: ");
            n = sc.nextInt();
            
            if(n > s){
                s = n;
            }
            
        }
            
        System.out.println("Maior: " + s);
		
		
		

	}

}
