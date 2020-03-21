package listadeexercicios04;

public class exe19 {
    
    static void imprimeImparVetor(int[] v) {
        System.out.printf("Elementos do vetor em posição impar: \n"
                + "[%d] --> %d \n" ,0,v[0]);
        for (int i = 0; i < v.length; i++) {
            if (i % 2 != 0) {
                System.out.printf("[%d] --> %d \n", i, v[i]);
            }
        }
        
    }
    
    public static void main(String[] args) {
        
        int t = exe01.tamanho();
        int[] vetor = exe01.criaVetor(t);
        exe01.imprimeVetor(vetor);
        imprimeImparVetor(vetor);
        
    }
    
}
