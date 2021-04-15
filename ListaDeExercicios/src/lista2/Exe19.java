import java.util.Scanner;

public class Exe19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		int s;
		
		do {
			System.out.print("Senha: ");
			s = sc.nextInt();

			if(s != senha) {
				System.err.println("Senha invalida");
			}
			else if(s == senha){
				System.out.println("Acesso permitido");
			}
		
		}while(s != senha);
		
		

	}

}
