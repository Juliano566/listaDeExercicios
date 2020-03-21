package listadeexercicios04;

public class exe09 {

    static int[] produtoDoisVetores(int t, int[] vetor1, int[] vetor2) {
        int[] vetor3 = new int[t];

        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = vetor1[i] * vetor2[i];
        }

        return vetor3;
    }

    public static void main(String[] args) {

        int t = exe01.tamanho();

        int[] vetor1 = exe01.criaVetor(t);
        System.out.println("Vetor 1");
        exe01.imprimeVetor(vetor1);

        System.out.println("Vetor 2");
        int[] vetor2 = exe01.criaVetor(t);
        exe01.imprimeVetor(vetor2);

        int[] vetor3 = produtoDoisVetores(t, vetor1, vetor2);
        System.out.println("Vetor 3 multiplicado cada elemento do vetor 1 e vetor 2: ");
        exe01.imprimeVetor(vetor3);

    }
}
