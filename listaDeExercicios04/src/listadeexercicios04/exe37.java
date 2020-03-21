package listadeexercicios04;

public class exe37 {

    static int[][] criaMatriz0ou1(int[] t) {
        int[][] m = new int[t[0]][t[1]];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.random() * 2);

            }
        }

        return m;
    }
    
    static int[][] transpostaM(int[][] m, int[] t){
         int[][] m2 = new int[t[1]][t[0]];

        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = m[j][i];
            }
        }
        return m2;
    }

    static int[] verifica0(int[][] m, int[] t) {
        boolean x;
        int l = 0;
        int c = 0;

        for (int i = 0; i < m.length; i++) {
            x = false;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] != 0) {
                    x = true;                   
                }
            }
            if (x == false) {
                l++;
            }
        }

        m = transpostaM(m, t);
       

        for (int i = 0; i < m.length; i++) {
            x = false;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] != 0) {
                    x = true;
                }
            }
            if (x == false) {
                c++;
            }
        }

        int[] v = {l, c};

        return v;

    }

    public static void main(String[] args) {

        int[] t = exe22.tamanhoMatriz();
        int[][] m = criaMatriz0ou1(t);
        exe22.imprimeMatriz(m);
        int[] v = verifica0(m, t);
        System.out.println("Quantidades de linhas nulas: " + v[0]);
        System.out.println("Quantidades de colunas nulas: " + v[1]);

    }

}
