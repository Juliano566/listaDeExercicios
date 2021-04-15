package funcoes;

import java.util.Scanner;

public class Exe01 {

	static Scanner sc = new Scanner(System.in);

	static int menor(int n1, int n2, int n3) {
		int r;
		if (n1 < n2 && n1 < n3) {
			r = n1;
		} else if (n2 < n1 && n2 < n3) {
			r = n2;
		} else {
			r = n3;
		}
		return r;
	}

	static int num() {
		int r;
		System.out.print("Digite o numero: ");
		r = sc.nextInt();

		return r;

	}

	static void saida(int n) {
		System.out.println("Menor numero: " + n);
	}

	public static void main(String[] args) {

		int n1 = num();
		int n2 = num();
		int n3 = num();
		int m = menor(n1, n2, n3);
		saida(m);

	}

}
