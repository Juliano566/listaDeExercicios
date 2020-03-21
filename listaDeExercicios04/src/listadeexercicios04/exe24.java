package listadeexercicios04;

public class exe24 {

    static int[][] matriz7Ou4(int[] m) {
        int[][] matriz = new int[m[0]][m[1]];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j % 2 == 0) {
                    matriz[i][j] = 4;
                } else {
                    matriz[i][j] = 7;
                }
            }
        }

        return matriz;
    }

    public static void main(String[] args) {

        int[] m = exe22.tamanhoMatriz();
        int[][] matriz = matriz7Ou4(m);
        System.out.println("Coluna impar: 7");
        System.out.println("Coluna par: 4");
        exe22.imprimeMatriz(matriz);

    }

}
