package listadeexercicios04;

public class exe34 {
    
    static int somaMatriz(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma = soma + matriz[i][j];
            }
        }
        return soma;
    }
    
    static void imprimeSomaMatriz(int soma) {
        System.out.println("Soma de todos elementos da matriz: " + soma);
    }
    
    public static void main(String[] args) {
        
        int[] t = exe22.tamanhoMatriz();
        int[][] matriz = exe22.criaMatriz(t);
        exe22.imprimeMatriz(matriz);
        int soma = somaMatriz(matriz);
        imprimeSomaMatriz(soma);
        
    }
}
