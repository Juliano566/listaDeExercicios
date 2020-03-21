package listadeexercicios04;

public class exe39 {

    static int produtoMtriz(int[][] m) {
        int produto = 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                produto = produto * m[i][j];
            }
        }
        return produto;
    }

    public static void main(String[] args) {

        int[] t1 = exe22.tamanhoMatriz();
        int[][] matriz1 = exe22.criaMatriz(t1);
        System.out.println("Matriz 1: ");
        exe22.imprimeMatriz(matriz1);
        int produto1 = produtoMtriz(matriz1);
        System.out.println("Produto matriz 1: " + produto1);

        int[] t2 = exe22.tamanhoMatriz();
        int[][] matriz2 = exe22.criaMatriz(t2);
        System.out.println("Matriz 2: ");
        exe22.imprimeMatriz(matriz2);
        int produto2 = produtoMtriz(matriz2);
        System.out.println("Produto matriz 2: " + produto2);
        
        System.out.println("Produto da matriz 1 e 2 juntas: " + produto1*produto2);

    }

}
