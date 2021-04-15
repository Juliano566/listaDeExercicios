package condicionais;

import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double s, v;
		
		System.out.print("Digite o nome do vendedor: ");
		nome =sc.next();
		
		System.out.print("Digite o salario fixo: R$");
		s = sc.nextDouble();
		
		System.out.print("Digite o valor em vendas: R$");
		v = sc.nextDouble();
		
		System.out.println("Nome do vendedor:  "+nome);
		System.out.println("Salario fixo:      R$"+s);
		System.out.println("Total de comissão: R$"+(15*v)/100);
		System.out.println("Salario total:     R$"+(s+((15*v)/100)));

		
	}

}
