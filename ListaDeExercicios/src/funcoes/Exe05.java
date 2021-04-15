package funcoes;

import java.util.Scanner;

public class Exe05 {

	static Scanner sc = new Scanner(System.in);

	static int num() {
		System.out.print("Numero: ");
		int n = sc.nextInt();
		return n;
	}

	static void raiz(int a, int b, int c) {
		double delta = 0;
		double r1, r2;

		delta = Math.pow(b, 2) - 4 * a * c;

		if (delta < 0) {
			System.out.println("Não ha raizes reais -1");
		} else {
			r1 = (-b + Math.sqrt(delta)) / (2 * a);

			r2 = (-b - Math.sqrt(delta)) / (2 * a);
			if (r1 > r2) {
				System.out.printf("Maior raiz:%.1f ", r1);
			} else {
				System.out.printf("Maior raiz:%.1f ", r2);
			}

		}

	}

	public static void main(String[] args) {

		int a = num();
		int b = num();
		int c = num();
		raiz(a, b, c);

	}

}
