package listadeexercicios04;

public class exe40 {
    
    static void imprimePosicao(int[][] m, int n) {
        System.out.printf("Numero %d aparecem em posição: \n", n);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == n) {
                    System.out.printf("[%d] [%d] --> %d \n", i, j, n);
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
        
        int[] t = exe22.tamanhoMatriz();
        int[][] matriz = exe22.criaMatriz(t);
        exe22.imprimeMatriz(matriz);
        int n = exe07.numero();
        imprimePosicao(matriz, n);
        
    }
    
}
