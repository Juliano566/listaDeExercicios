package listadeexercicios04;

public class exe41 {
    
    static int maiorMatriz(int[][] m) {
        int maior = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > maior) {
                    maior = m[i][j];
                }
            }
        }
        return maior;
    }
    
    static void imprimeMaiorMatriz(int maior) {
        System.out.println("Maior elemento da matriz: " + maior);
    }
    
    public static void main(String[] args) {
        
        int[] t = exe22.tamanhoMatriz();
        int[][] matriz = exe22.criaMatriz(t);
        exe22.imprimeMatriz(matriz);
        int maior = maiorMatriz(matriz);
        imprimeMaiorMatriz(maior);
        
    }
    
}
