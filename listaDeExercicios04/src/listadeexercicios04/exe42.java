package listadeexercicios04;

public class exe42 {
    
    static void imprimeProdutoMatriz(int n1, int n2) {
        System.out.println("Maior elemento da Matriz 1: " + n1);
        System.out.println("Maior elemento da Matriz 2: " + n2);
        System.out.println("Produto do maior elemento da matriz 1 pelo maior da matriz 2: " + n1 * n2);
    }
    
    public static void main(String[] args) {
        
        int[] t = exe22.tamanhoMatriz();
        int[][] matriz1 = exe22.criaMatriz(t);
        System.out.println("Matriz 1: ");
        exe22.imprimeMatriz(matriz1);
        int[][] matriz2 = exe22.criaMatriz(t);
        System.out.println("Matriz 2: ");
        exe22.imprimeMatriz(matriz2);
        int maior1 = exe41.maiorMatriz(matriz1);
        int maior2 = exe41.maiorMatriz(matriz2);
        imprimeProdutoMatriz(maior1, maior2);
        
    }
    
}
