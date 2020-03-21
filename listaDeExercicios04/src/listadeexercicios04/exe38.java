package listadeexercicios04;

public class exe38 {
    
    static int somaAcimaDiagonal(int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (j > i) {
                    soma = soma + m[i][j];
                }
            }
        }
        return soma;
    }
    
    static void imprimeSomaAcimaDiagonal(int soma) {
        System.out.println("Soma dos elementos acima da diagonal principal: " + soma);
    }
    
    public static void main(String[] args) {
        
        int[] t = exe36.tamanhoNxN();
        int[][] matriz = exe22.criaMatriz(t);
        exe22.imprimeMatriz(matriz);
        int soma = somaAcimaDiagonal(matriz);
        imprimeSomaAcimaDiagonal(soma);
        
    }
}
