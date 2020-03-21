package listadeexercicios04;

public class exe28 {

    static void somaLinhaM(int[][] m, int[] t) {
        int[] v = new int[t[0]];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                v[i] = v[i] + m[i][j];
            }
            System.out.printf("Soma da linha %d: %d \n", (i + 1), v[i]);
        }
    }

    public static void main(String[] args) {

        int[] t = exe22.tamanhoMatriz();
        int[][] matriz = exe22.criaMatriz(t);
        exe22.imprimeMatriz(matriz);
        somaLinhaM(matriz, t);
    }
}
