import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {
		
       Scanner sc  = new Scanner(System.in);
        
        int n = 20;
        double s = 0;
        
        
        for(double i = 1; i <= 20; i++){
            
            s = s + (1/i);
            
        }
    
		System.out.printf("Soma: %.2f" , s);

	}

}
