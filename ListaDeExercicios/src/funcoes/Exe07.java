package funcoes;

import java.util.Scanner;

public class Exe07 {

	static Scanner sc = new Scanner(System.in);

	static double num() {
		double r;
		System.out.print("Digite raio da esfera: ");
		r = sc.nextDouble();
		return r;
	}

	static double volume(double n) {
		double v;
		v = 4.0 / 3.0 * Math.PI * Math.pow(n, 3);
		return v;

	}

	static void saida(double v) {
		System.out.printf("Volume da esfera: %.1f" , v);
	}

	public static void main(String[] args) {

		double r = num();
		double v = volume(r);
		saida(v);

	}

}
