package funcoes;

import java.util.Scanner;

public class Exe15 {

	static Scanner sc = new Scanner(System.in);

	static double num() {
		System.out.print("Digite o numero: ");
		double n = sc.nextInt();
		return n;
	}

	static double pot(double x, double z) {
		double s = 1;
		for (int i = 0; i < z; i++) {
			s = s * x;
		}

		return s;
	}

	static void saida(double x, double z, double s) {
		System.out.println(x + " elevado a " + z + " = " + s);
	}

	public static void main(String[] args) {

		double x = num();
		double z = num();
		double s = pot(x, z);
		saida(x, z, s);

	}

}
