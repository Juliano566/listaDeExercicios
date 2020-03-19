package adoMatriz;

public class exe02 {

    static int[][] matrizTransposta(int[] t, int[][] m) {
        int[][] mT = new int[t[0]][t[1]];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                mT[i][j] = m[j][i];
            }
        }
        return mT;
    }

    public static void main(String[] args) {

        int[] tamanho = exe01.tamanhoMatriz();
        int[][] matriz = exe01.criaMtriz(tamanho);
        System.out.println("Matriz: ");
        exe01.imprimeMatriz(matriz);
        int[][] mT = matrizTransposta(tamanho, matriz);
        System.out.println("Matriz transposta: ");
        exe01.imprimeMatriz(mT);

    }

}
