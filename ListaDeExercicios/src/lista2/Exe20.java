import java.util.Scanner;

public class Exe20 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		double saldo = 0;
		double saldo1 = 0;
		int x;
		
		do {
			System.out.println("Saldo atual: " + saldo);
			System.out.println("Digite 1 para realizar um deposito: ");
			System.out.println("Digite 2 para relizar um saque: ");
			System.out.println("Digite 3 para encerrar: ");
			x = sc.nextInt();
			
			if (x == 1) {
				System.out.print("Valor do deposito: ");
				saldo1 = sc.nextDouble();
                saldo = saldo + saldo1;			
			}
			else if(x == 2) {
				System.out.print("Valor do saque: ");
				saldo1 = sc.nextDouble();
				saldo = saldo - saldo1;
			}
			else if(x != 1 && x != 2 && x != 3 ){
				System.err.println("OPERAÇÃO INVALIDA");
			}
			
			
		}while(x != 3);
		
		
		    if(saldo > 0) {
		    	System.out.println("Saldo total: " + saldo);
		    	System.out.println("CONTA PREFERENCIAL");
		    }
		    else if(saldo < 0) {
		    	System.out.println("Saldo total: " + saldo);
		    	System.err.println("CANTA ESTOURADA");
		    }
		    else if(saldo == 0) {
		    	System.out.println("Saldo total: " + saldo);
		    	System.out.println("CONTA ZERADA");
		    }
		

	}

}
