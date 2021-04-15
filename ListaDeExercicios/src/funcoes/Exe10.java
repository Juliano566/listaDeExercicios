package funcoes;

import java.util.Scanner;

public class Exe10 {

	static Scanner sc = new Scanner(System.in);

	static int num() {
		int n = 0;

		do {
			System.out.print("Idade do nadador: ");
			n = sc.nextInt();

			if (n < 5) {
				System.err.println("Valor invalido");
			}

		} while (n < 5);
		return n;

	}

	static int media(int n) {
		int r = 0;
		if (n >= 5 && n <= 7) {
			r = 1;
		} else if (n >= 8 && n <= 10) {
			r = 2;
		} else if (n >= 11 && n <= 13) {
			r = 3;
		} else if (n >= 14 && n <= 17) {
			r = 4;
		} else {
			r = 5;
		}

		return r;

	}

	static String parametro(int r) {

		String m = " ";

		switch (r) {
		case 1:
			m = "Infantil A";
			break;
		case 2:
			m = "Infantil B";
			break;
		case 3:
			m = "Juvenil A";
			break;
		case 4:
			m = "Juvenil B";
			break;
		case 5:
			m = "Adulto";
			break;

		}

		return m;
	}

	static void saida(String m) {
		System.out.println(m);
	}

	public static void main(String[] args) {

		int n = num();
		int p = media(n);
		String m = parametro(p);
		saida(m);

	}

}
