package funcoes;

import java.util.Scanner;

public class Exe02 {

	static Scanner sc = new Scanner(System.in);

	public static int num() {
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

	public static int somatoria(int n) {
		int r = 0;
		int soma = 0;

		while (n >= 0) {
			soma = soma + n;

			n--;
		}

		r = soma;

		return r;
	}

	static void saida(int r, int n) {
		System.out.println("Soma de todos os numero menores que " + n + " è: " + r);
	}

	public static void main(String[] args) {

		int n = num();
		int r = somatoria(n);
		saida(r, n);

	}

}
