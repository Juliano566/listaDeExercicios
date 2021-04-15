package funcoes;

import java.util.Scanner;

public class Exe03 {

	static Scanner sc = new Scanner(System.in);

	static int num() {
		int r;
		do {
			System.out.print("Digite o numero: ");
			r = sc.nextInt();

			if (r < 0) {
				System.err.println("Numero invalido");
			}

		} while (r < 0);

		return r;
	}

	public static int fatorial(int n) {
		int r = 0;
		int soma = 1;

		while (n > 0) {
			soma = soma * n;

			n--;
		}

		r = soma;
		return r;
	}

	static void saida(int n, int r) {
		System.out.println("Fatorial de todos os numeros menores que " + n + " é: " + r);
	}

	public static void main(String[] args) {

		int n = num();
		int r = fatorial(n);
		saida(n, r);

	}

}
