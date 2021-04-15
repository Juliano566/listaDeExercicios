package funcoes;

import java.util.Scanner;

public class Exe08 {

	static Scanner sc = new Scanner(System.in);

	static double num() {
		System.out.print("Numero :");
		int n = sc.nextInt();
		return n;
	}

	static boolean teste(double n) {
		boolean primo = false;
		int con = 0;
		for (int i = 0; i <= n; i++) {
			if (n % i == 0) {
				con++;
			}

			if (con == 2) {
				primo = true;
			} else if (con > 2) {
				primo = false;
			}

		}

		return primo;
	}

	static void saida(boolean primo) {
		if (primo == true) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}

	}

	public static void main(String[] args) {

		double n = num();
		boolean primo = teste(n);
		saida(primo);

	}

}
