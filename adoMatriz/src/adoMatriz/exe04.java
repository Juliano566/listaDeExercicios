package adoMatriz;

public class exe04 {

    static int somaBaixoDiagonal(int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i > j) {
                    soma = soma + m[i][j];
                }
            }
        }
        return soma;
    }

    public static void main(String[] args) {

        int[] tamanho = {4, 4};

        int[][] matriz = exe01.criaMtriz(tamanho);
        System.out.println("Matriz: ");
        exe01.imprimeMatriz(matriz);
        int soma = somaBaixoDiagonal(matriz);
        System.out.println("Soma dos elementos abaixo da diagonal principal: " + soma);
    }
}
