package listadeexercicios04;

public class exe27 {

    static int[][] matrizL(int[] m) {
        int[][] matriz = new int[m[0]][m[1]];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j;
            }
        }
        return matriz;
    }

    public static void main(String[] args) {

        int[] m = exe22.tamanhoMatriz();
        int[][] matriz = matrizL(m);
        System.out.println("Matriz preenchida com a soma de linha com coluna: ");
        exe22.imprimeMatriz(matriz);

    }

}
