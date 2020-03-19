package adoMatriz;

public class exe03 {

    static int somaElementosMtriz(int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                soma = soma + m[i][j];
            }
        }
        return soma;
    }

    public static void main(String[] args) {

        int[] tamanho = {2, 3};

        int[][] matriz = exe01.criaMtriz(tamanho);
        System.out.println("Matriz: ");
        exe01.imprimeMatriz(matriz);
        int soma = somaElementosMtriz(matriz);
        System.out.println("Soma de todos elementos da matriz: " + soma);

    }

}
