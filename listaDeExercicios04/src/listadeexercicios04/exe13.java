package listadeexercicios04;

public class exe13 {

    static void juntaDoisVetor(int t, int[] vetor1, int[] vetor2) {
        int x = t * 2;
        int[] vetor3 = new int[x];
        int cont = 0;

        for (int i = 0; i < vetor1.length; i++) {
            vetor3[i] = vetor1[i];
        }
        for (int i = t; i < x; i++) {
            vetor3[i] = vetor2[cont];
            cont++;
        }
        for (int i = 0; i < vetor3.length; i++) {
            System.out.printf("[%d] --> %d \n", i, vetor3[i]);
        }

    }

    public static void main(String[] args) {

        int t = exe01.tamanho();
        int[] vetor1 = exe01.criaVetor(t);
        int[] vetor2 = exe01.criaVetor(t);
        System.out.println("Vetor 1:");
        exe01.imprimeVetor(vetor1);
        System.out.println("Vetor 2:");
        exe01.imprimeVetor(vetor2);
        System.out.println("União do vetor 1 com vetor 2: ");
        juntaDoisVetor(t, vetor1, vetor2);

    }
}
