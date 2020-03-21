package listadeexercicios04;

public class exe29 {

    static int[][] matrizVLinha(int[] t, int[] v) {
        int[][] m = new int[t[0]][t[1]];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = v[j];
            }
        }
        return m;
    }

    public static void main(String[] args) {

        int[] t = exe22.tamanhoMatriz();
        int[] v = exe01.criaVetor(t[1]);
        System.out.println("Vetor: ");
        exe01.imprimeVetor(v);
        int[][] matriz = matrizVLinha(t, v);
        System.out.println("Cada linha da matriz preenchida com os elementos do vetor: ");
        exe22.imprimeMatriz(matriz);

    }

}
