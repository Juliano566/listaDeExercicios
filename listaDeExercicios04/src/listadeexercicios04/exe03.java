package listadeexercicios04;

public class exe03 {

    static int maiorVetor(int[] vetor) {
        int maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("[%d] -> %d", i, vetor[i]);
            if (vetor[i] == maior) {
                System.out.print(" <-- Maior");

            }System.out.println("");
        }
        return maior;
    }

    static void imprimeMaiorVetor(int maior) {
        System.out.println("Maior numero do vetor: " + maior);
    }

    public static void main(String[] args) {

        int t = exe01.tamanho();
        int[] vetor = exe01.criaVetor(t);
        int maior = maiorVetor(vetor);
        imprimeMaiorVetor(maior);

    }

}
