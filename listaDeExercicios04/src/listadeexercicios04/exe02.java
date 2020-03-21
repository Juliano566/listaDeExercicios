
package listadeexercicios04;

public class exe02 {
    
    static int somaVetor(int[] vetor){
        int n = 0;
        for (int i = 0; i < vetor.length; i++) {
            n = n + vetor[i];
            
        }
        return n;
    }
    
    static void imprimeSomaVetor(int n){
        System.out.println("Soma de todos os numeros do vetor: " + n);
    }
    
    public static void main(String[] args) {
        
        int t = exe01.tamanho();
        int []vetor = exe01.criaVetor(t);
        exe01.imprimeVetor(vetor);
        int n = somaVetor(vetor);
        imprimeSomaVetor(n);
        
        
        
    }
    
}
