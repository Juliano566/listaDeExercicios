import java.util.Scanner;

public class Exe11 {

	public static void main(String[] args) {
		

        Scanner sc = new Scanner(System.in);
        
        int n;
        double s = 0;
        
        System.out.print("Numero: ");
        n = sc.nextInt();
        
        for(double i = 1; i <= n; i++ ){
            if(i%2 == 0){
                s = s - (1/i);  
            }
            else if (i%2 != 0){
                s = s + (1/i);
            }
            
        }
                
        System.out.printf("Soma: %.2f",  s);

	}

}
