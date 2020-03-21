package listadeexercicios04;

public class exe14 {

    static void juntaDoisVetor2(int t, int[] vetor1, int[] vetor2) {
        int x = t * 2;
        int[] vetor3 = new int[x];
        int contV1 = 1;
        int contV2 = 0;

        vetor3[0] = vetor1[0];

        for (int i = 1; i < vetor1.length; i++) {
            if (i % 2 != 0) {
                vetor3[i] = vetor2[contV2];
                contV2++;
            } else {
                vetor3[i] = vetor1[contV1];
                contV1++;
            }

        }
        for (int i = t; i < vetor3.length; i++) {
            if (i % 2 == 0) {
                vetor3[i] = vetor1[contV1];
                contV1++;
            } else {
                vetor3[i] = vetor2[contV2];
                contV2++;
            }

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
        System.out.println("União do vetor 1 e vetor 2 alternadamente:");
        juntaDoisVetor2(t, vetor1, vetor2);

    }

}
