package listadeexercicios04;

import java.util.Scanner;

public class exe33 {
    
    static Scanner sc = new Scanner(System.in);
    
    static int[][] matrizNegativo(int[] t) {
        int[][] m = new int[t[0]][t[1]];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                m[i][j] = sc.nextInt();                
            }
        }
        return m;
        
    }
    
    static void verificaNegativoM(int[][] m) {
        System.out.println("Posição dos numeros negativos: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] < 0) {
                    System.out.printf("[%d][%d] --> %d \n", i, j, m[i][j]);
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
        
        int[] t = exe22.tamanhoMatriz();
        int[][] matriz = matrizNegativo(t);
        verificaNegativoM(matriz);
    }
}
