package funcoes;

import java.util.Scanner;

public class Exe06 {

	static Scanner sc = new Scanner(System.in);

	static int num() {
		System.out.print("Numero: ");
		int n = sc.nextInt();
		return n;
	}

	static int valor() {
		int d = 0;
		do {

			System.out.println("Digite 1 para saber a maior raiz ");
			System.out.println("Digite 2 para saber a menor raiz");
			d = sc.nextInt();

			if (d > 2 || d < 1) {
				System.err.println("Valor invalido");
			}

		} while (d != 1 && d != 2);

		return d;

	}

	static void raiz(int a, int b, int c, int d) {
		double delta = 0;
		double r1, r2;

		delta = Math.pow(b, 2) - 4 * a * c;

		if (delta < 0) {
			System.out.println("Não ha raizes reais -1");
		} else {
			r1 = (-b + Math.sqrt(delta)) / (2 * a);

			r2 = (-b - Math.sqrt(delta)) / (2 * a);
			if (r1 > r2) {
				if (d == 1) {
					System.out.printf("Maior raiz:%.1f ", r1);
				} else {
					System.out.printf("menor raiz:%.1f ", r2);

				}
			} else if (r2 > r1) {
				if (d == 2) {
					System.out.printf("Maior raiz:%.1f ", r2);
				} else {
					System.out.printf("menor raiz:%.1f ", r1);
				}

			}

		}

	}

	public static void main(String[] args) {

		int a = num();
		int b = num();
		int c = num();
		int d = valor();
		raiz(a, b, c, d);

	}

}
