package funcoes;

import java.util.Scanner;

public class Exe12 {

	static Scanner sc = new Scanner(System.in);

	static double altura() {
		System.out.print("Digite sua altura: ");
		double a = sc.nextDouble();
		return a;

	}

	static char sexo() {
		char s = ' ';
		do {
			System.out.print("Sexo: ");
			s = sc.next().charAt(0);

			if (s != 'f' && s != 'F' && s != 'm' & s != 'M') {
				System.out.println();
				System.err.println("Invalido");
			}

		} while (s != 'f' && s != 'F' && s != 'm' && s != 'M');

		return s;

	}

	static double peso(double a, char s) {
		double p = 0;
		switch (s) {

		case 'f':
		case 'F':
			p = 62.1 * a - 44.7;
			break;
		case 'm':
		case 'M':
			p = 72.7 * a - 58;
			break;

		}

		return p;
	}

	static void saida(double p) {
		System.out.printf("Peso ideal: %.1f", p);
	}

	public static void main(String[] args) {

		double a = altura();
		char s = sexo();
		double p = peso(a, s);
		saida(p);

	}

}
