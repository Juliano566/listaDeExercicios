package listadeexercicios04;

public class exe12 {

    static int[] somaVetor(int[] vetor1, int[] vetor2) {
        int soma1 = 0;
        int soma2 = 0;

        int vetorSoma[] = new int[2];

        for (int i = 0; i < vetor1.length; i++) {
            soma1 = soma1 + vetor1[i];
            soma2 = soma2 + vetor2[i];

        }

        vetorSoma[0] = soma1;
        vetorSoma[1] = soma2;

        return vetorSoma;
    }

    static double[] mediaVetor(int[] vetorS, int t) {
        double[] vetorM = new double[2];

        vetorM[0] = vetorS[0] / t;
        vetorM[1] = vetorS[1] / t;

        return vetorM;

    }

    static void imprimeMediaSoma(int[] vetorS, double[] vetorM) {

        if (vetorS[0] > vetorS[1]) {
            System.out.println("Vetor 1 com maior soma dos elementos: " + vetorS[0]);
        } else {
            System.out.println("Vetor 2 com maior soma dos elementos: " + vetorS[1]);
        }

        if (vetorM[0] > vetorM[1]) {
            System.out.println("Vetor 2 com menor media: " + vetorM[1]);
        } else {
            System.out.println("Vetor 1 com menor media: " + vetorM[0]);
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
        int[] vetorSoma = somaVetor(vetor1, vetor2);
        double[] vetorM = mediaVetor(vetorSoma, t);
        imprimeMediaSoma(vetorSoma, vetorM);
    }

}
