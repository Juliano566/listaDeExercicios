package listadeexercicios04;

public class exe35 {

    static double mediaPositivoM(int[][] m) {
        double soma = 0;
        int cont = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] >= 0) {
                    cont++;
                    soma = soma + m[i][j];
                }
            }
        }
        soma = soma / cont;
        return soma;
    }

    static void imprimeMediaPositivoM(double media) {
        System.out.printf("Media dos elementos positivos da matriz: %.1f\n", media);
    }

    public static void main(String[] args) {

        int[] t = exe22.tamanhoMatriz();
        int[][] matriz = exe22.criaMatriz(t);
        exe22.imprimeMatriz(matriz);
        double media = mediaPositivoM(matriz);
        imprimeMediaPositivoM(media);

    }
}
