package condicionais;

import java.util.Scanner;

public class Exe16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int hi, hf;
		
		System.out.print("Digite a hora incial do jogo: ");
		hi = sc.nextInt();
		
		System.out.print("Digite a hora final do jogo: ");
		hf = sc.nextInt();
		
		if (hi >= hf) {
			System.out.println("O jogo durou " + (hf - hi + 24) + " hora(s)");
		}
		
		else {
			System.out.println("O jogo durou " + (hf - hi) + " hora(s)");
		}
		
		
		
		
	}

}
