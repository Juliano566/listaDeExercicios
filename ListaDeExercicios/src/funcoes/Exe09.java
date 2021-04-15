package funcoes;

import java.util.Scanner;

public class Exe09 {

	static Scanner sc = new Scanner(System.in);

	static int num1() {
		System.out.print("Anos: ");
		int ano = sc.nextInt();
		return ano;
	}

	static int num2() {

		System.out.print("Meses: ");
		int mes = sc.nextInt();
		return mes;
	}

	static int num3() {
		System.out.print("Dias: ");
		int dia = sc.nextInt();
		return dia;
	}

	static int dias(int n1, int n2, int n3) {
		int soma = 0;

		n1 = n1 * 365;
		n2 = n2 * 30;
		soma = n1 + n2 + n3;

		return soma;
	}

	static void saida(int a) {
		System.out.println("Idade em dia: " + a);
	}

	public static void main(String[] args) {

		int n1 = num1();
		int n2 = num2();
		int n3 = num3();
		int soma = dias(n1, n2, n3);
		saida(soma);

	}

}
