package listadeexercicios04;

public class exe25 {

    static int[][] matrizL(int[] m) {
        int[][] matriz = new int[m[0]][m[1]];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = m[0];
            }
        }
        return matriz;
    }

    public static void main(String[] args) {

        int[] m = exe22.tamanhoMatriz();
        int[][] matriz = matrizL(m);
        System.out.println("Matriz preenchida com o numero de linhas: " + m[0]);
        exe22.imprimeMatriz(matriz);

    }

}
