package listadeexercicios04;

public class exe32 {

    static void somaColunaImparM(int[][] m, int[] t) {
        int[] v = new int[t[1]];
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (j % 2 != 0) {
                    soma = soma + m[i][j];
                }
            }
        }
        System.out.printf("Soma dos elementos das colunas impar: %d \n", soma);

    }

    public static void main(String[] args) {

        int[] t = exe22.tamanhoMatriz();
        int[][] matriz = exe22.criaMatriz(t);
        exe22.imprimeMatriz(matriz);
        somaColunaImparM(matriz, t);
    }
}
