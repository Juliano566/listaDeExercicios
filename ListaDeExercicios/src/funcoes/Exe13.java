package funcoes;

import java.util.Scanner;

public class Exe13 {

	static Scanner sc = new Scanner(System.in);

	static double num() {
		System.out.print("Digite o numero: ");
		double n = sc.nextInt();
		return n;
	}

	static int div(double n) {
		int con = 0;
		for (int i = 0; i <= n; i++) {
			if (n % i == 0) {
				con++;
			}

		}
		return con;

	}

	static void saida(double n, int d) {
		System.out.println("Numero de divisoes de " + n + " = " + d);
	}

	public static void main(String[] args) {

		double n = num();
		int d = div(n);
		saida(n, d);

	}

}
