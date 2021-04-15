package funcoes;

import java.util.Scanner;

public class Exe04 {

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

	static int fatorial(int n) {
		int r = 0;
		int soma = 1;

		while (n > 0) {
			soma = soma * n;

			n--;
		}

		r = soma;
		return r;
	}

	static int somatoria(int n) {
		int r = 0;
		int soma = 0;

		while (n >= 0) {
			soma = soma + n;

			n--;
		}

		r = soma;

		return r;
	}

	static void saida(int s, int f) {
		System.out.println(f + " / " + s + " = " + f / s);
	}

	public static void main(String[] args) {

		int n = num();
		int f = fatorial(n);
		int s = somatoria(n);
		saida(s, f);

	}

}
