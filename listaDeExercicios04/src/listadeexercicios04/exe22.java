package listadeexercicios04;

import java.util.Scanner;

public class exe22 {
    
    static Scanner sc = new Scanner(System.in);
    
    static int[] tamanhoMatriz() {
        int[] m = new int[2];
        System.out.print("Numero de linhas: ");
        m[0] = sc.nextInt();
        
        System.out.print("Numero de colunas: ");
        m[1] = sc.nextInt();
        
        return m;
        
    }
    
    static int[][] criaMatriz(int[] m) {
        int n = 0;
        int[][] matriz = new int[m[0]][m[1]];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                n = (int) (Math.random() * 9 + 1);
                matriz[i][j] = n;
            }
        }
        return matriz;
    }
    
    static int[][] matriz20(int[] m){
        int[][] matriz = new int[m[0]][m[1]];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 20;
            }
        }
        return matriz;
        
    }
    
    static void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {                
                System.out.printf("%d  ", matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        
        int[] m = tamanhoMatriz();
        int[][] matriz = matriz20(m);
        System.out.println("Matriz preenchida com numero 20: ");
        imprimeMatriz(matriz);
        
    }
    
}
