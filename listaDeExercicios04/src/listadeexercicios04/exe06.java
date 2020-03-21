package listadeexercicios04;

public class exe06 {
    
    static int produtoVetor(int[] vetor) {
        int produto = 1;
        for (int i = 0; i < vetor.length; i++) {
            produto = produto * vetor[i];
        }
        return produto;
    }
    
    static void imprimeProdutoVetor(int produto) {
        System.out.println("Produto dos elementos do vetor: " + produto);
    }
    
    public static void main(String[] args) {
        
        int t = exe01.tamanho();
        int[] vetor = exe01.criaVetor(t);
        exe01.imprimeVetor(vetor);
        int produto = produtoVetor(vetor);
        imprimeProdutoVetor(produto);
        
    }
    
}
