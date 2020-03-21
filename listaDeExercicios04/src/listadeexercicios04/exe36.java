package listadeexercicios04;

import java.util.Scanner;

public class exe36 {
    
    static Scanner sc = new Scanner(System.in);
    
    static int[] tamanhoNxN() {
        int t;
        System.out.printf("Numero de linhas e colunas: ");
        t = sc.nextInt();
        
        int[] v = {t, t};
        
        return v;
    }
    
    static int somaDiagonalM(int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    soma = soma + m[i][j];
                }
            }
        }
        return soma;
        
    }
    
    static void imprimeSomaDiagonal(int soma) {
        System.out.println("Soma dos elementos na diagonal principal: " + soma);
    }
    
    public static void main(String[] args) {
        
        int[] t = tamanhoNxN();
        int[][] matriz = exe22.criaMatriz(t);
        exe22.imprimeMatriz(matriz);
        int soma = somaDiagonalM(matriz);
        imprimeSomaDiagonal(soma);
        
    }
    
}
