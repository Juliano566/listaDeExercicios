package listadeexercicios04;

import java.util.Scanner;

public class exe01 {

    static Scanner sc = new Scanner(System.in);

    static int tamanho() {
        System.out.print("Digite o tamanho do vetor: ");
        int t = sc.nextInt();
        return t;

    }

    static int[] criaVetor(int t) {
        int[] vetor = new int[t];

        for (int i = 0; i < vetor.length; i++) {
            int n = (int) (Math.random() * 100 + 1);
            vetor[i] = n;
        }
        return vetor;

    }

    static void imprimeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("[%d] -> %d \n",i,vetor[i]);
        }
    }

    public static void main(String[] args) {

        int t = tamanho();
        int[] vetor = criaVetor(t);
        imprimeVetor(vetor);

    }
}
