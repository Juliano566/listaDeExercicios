package listadeexercicios04;

public class exe16 {
    
    static void parImpar(int[] v) {
        System.out.println("Numeros pares: ");
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                System.out.printf("[%d] --> %d \n", i, v[i]);
            }
        }
        System.out.println("Numero impar: ");
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 != 0) {
                System.out.printf("[%d] --> %d \n", i, v[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        
        int t = exe01.tamanho();
        int[] vetor = exe01.criaVetor(t);
        exe01.imprimeVetor(vetor);
        parImpar(vetor);
    }
    
}
