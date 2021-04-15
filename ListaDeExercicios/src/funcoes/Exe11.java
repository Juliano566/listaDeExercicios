package funcoes;

import java.util.Scanner;

public class Exe11 {

	static Scanner sc = new Scanner(System.in);

	static double media() {
		double m = 0;
		do {
			System.out.println("Media do aluno: ");
			m = sc.nextDouble();

			if (m > 10) {
				System.err.println("Valor invalido");
			}

		} while (m > 10);
		return m;
	}

	static String valor(double m) {
		String p = " ";
		if (m >= 0 && m <= 4.9) {
			p = "D";
		} else if (m >= 5 && m <= 6.9) {
			p = "C";
		} else if (m >= 7 && m <= 8.9) {
			p = "B";
		} else {
			p = "A";
		}
		return p;
	}

	static void saida(String p) {
		System.out.println(p);
	}

	public static void main(String[] args) {

		double n = media();
		String p = valor(n);
		saida(p);

	}

}
