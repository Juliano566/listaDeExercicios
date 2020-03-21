package listadeexercicios04;

public class exe23 {
    
    static int[][] matriz21Ou10(int[] m) {
        int[][] matriz = new int[m[0]][m[1]];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 0) {
                    matriz[i][j] = 10;
                } else {
                    matriz[i][j] = 21;
                }
            }
        }
        
        return matriz;
        
    }
    
    public static void main(String[] args) {
        
        int[] m = exe22.tamanhoMatriz();
        int[][] matriz = matriz21Ou10(m);
        System.out.println("Linha impar: 21");
        System.out.println("Linha par: 10");
        exe22.imprimeMatriz(matriz);
        
    }
}
