package condicionais;

import java.util.Scanner;

public class Exe09 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int c;
		double h, v;		
		
		System.out.print("Digite seu numero de cadastro: ");
		c = sc.nextInt();
		
		System.out.print("Digite o numero de horas trabalhadas: ");
		h = sc.nextDouble();
		
		System.out.print("Digite o valor que recebe por hora: ");
		v = sc.nextDouble();
		
		System.out.println("numero de cadastro:     " + c);
		System.out.println("valor a ser recebido: R$" + (h*v));
		
		

	}

}
