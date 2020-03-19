package adoMatriz;

import java.util.Scanner;

public class exe01 {

    static Scanner sc = new Scanner(System.in);

    static int[] tamanhoMatriz() {
        int[] vetorM = new int[2];

        System.out.print("Numero de linhas: ");
        vetorM[0] = sc.nextInt();

        System.out.print("Numero de colunas: ");
        vetorM[1] = sc.nextInt();

        return vetorM;
    }

    static int[][] criaMtriz(int[] vetorM) {
        int n = 0;
        int[][] matriz = new int[vetorM[0]][vetorM[1]];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                n = (int) (Math.random() * 100 + 1);
                matriz[i][j] = n;
            }
        }

        return matriz;

    }

    static int[][] somaMtriz(int[][] m1, int[][] m2, int[] vetorM) {
        int[][] m3 = new int[vetorM[0]][vetorM[1]];

        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[i].length; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return m3;
    }

    static void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {

        int[] tamanho = tamanhoMatriz();
        int[][] m1 = criaMtriz(tamanho);
        System.out.println("Matriz 1:");
        imprimeMatriz(m1);
        int[][] m2 = criaMtriz(tamanho);
        System.out.println("Matriz 2:");
        imprimeMatriz(m2);
        int[][] m3 = somaMtriz(m1, m2, tamanho);
        System.out.println("Soma da matriz 1 e 2:");
        imprimeMatriz(m3);

    }
}
