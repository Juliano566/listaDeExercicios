package funcoes;

import java.util.Scanner;

public class Exe14 {

	static Scanner sc = new Scanner(System.in);

	static int num() {
		System.out.print("Digite o numero: ");
		int n = sc.nextInt();
		return n;
	}

	static int soma(int a, int n) {

		int s = 0;
		int con = 0;

		if (n <= 0) {
			s = -1;
		} else {
			for (int i = 1; i <= n; i++) {
				s = s + a + con++;
			}
		}
		return s;

	}

	static void saida(int a, int n, int s) {
		System.out.println("Soma dos " + n + " numeros a partir de " + a + " = " + s);
	}

	public static void main(String[] args) {

		int a = num();
		int n = num();
		int s = soma(a, n);
		saida(a, n, s);

	}

}
