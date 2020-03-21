package listadeexercicios04;

public class exe31 {

    static void somaColunaM(int[][] m, int[] t) {
        int[] v = new int[t[1]];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {                         
            v[j] = v[j] + m[i][j];     
            }       
        }
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Soma da coluna %d: %d \n",(i+1),v[i]);
        }
    }

    public static void main(String[] args) {

        int[] t = exe22.tamanhoMatriz();
        int[][] matriz = exe22.criaMatriz(t);
        exe22.imprimeMatriz(matriz);
        somaColunaM(matriz, t);
    }
}
