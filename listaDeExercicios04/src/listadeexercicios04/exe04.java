package listadeexercicios04;

public class exe04 {

    static int menorVetor(int[] vetor) {
        int menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (menor > vetor[i]) {
                menor = vetor[i];
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("[%d] -> %d", i, vetor[i]);
            if (vetor[i] == menor) {
                System.out.print(" <-- Menor");

            }
            System.out.println("");
        }

        return menor;
    }
    
    static void imprimeMenorVetor(int menor){
        System.out.println("Menor numero do vetor: " + menor);
    }

    public static void main(String[] args) {

        int t = exe01.tamanho();
        int[] vetor = exe01.criaVetor(t);
        int menor = menorVetor(vetor);
        imprimeMenorVetor(menor);
    }
}
