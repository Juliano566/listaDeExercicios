package listadeexercicios04;

public class exe20 {

    static int[] mul3(int[] v) {
        int cont3 = 0;
        int contIm = 0;
        int[] v2 = new int[3];

        for (int i = 0; i < v.length; i++) {
            if (v[i] % 3 == 0) {
                cont3++;
            }
            if (i % 2 != 0) {
                contIm++;
            }
        }

        v2[0] = cont3;
        v2[1] = contIm++;
        if (cont3 > 0) {
            v2[2] = 0;
        } else {
            v2[2] = 1;
        }
        return v2;

    }

    static int[] verificaVetor(int[] vetor, int[] vX) {
        int[] v;
        int cont3 = 0;
        int contIm = 0;
        if (vetor[2] == 0) {
            v = new int[vetor[0]];
            for (int i = 0; i < vX.length; i++) {
                if (vX[i] % 3 == 0) {
                    v[cont3] = vX[i];
                    cont3++;
                }
            }
        } else {
            v = new int[vetor[1]];
            for (int i = 0; i < vX.length; i++) {
                if (i % 2 != 0) {
                    v[contIm] = vX[i];
                    contIm++;
                }
            }
        }

        return v;

    }

    static void imprime3OuImpar(int[] v, int[] v2) {

        if (v2[2] == 0) {
            System.out.println("Elementos do vetor multiplos de 3: ");
            for (int i = 0; i < v.length; i++) {
                System.out.printf("[%d] --> %d \n ", i, v[i]);
            }
        } else {
            System.err.println("Vetor não contem elementos multiplos de 3");
            System.out.println("Elementos do vetor em posição impar: ");
            for (int i = 0; i < v.length; i++) {
                System.out.printf("[%d] --> %d\n ", i, v[i]);
            }
        }

    }

    public static void main(String[] args) {

        int t = exe01.tamanho();
        int[] vetor = exe01.criaVetor(t);
        exe01.imprimeVetor(vetor);
        int[] v2 = mul3(vetor);
        int[] v = verificaVetor(v2, vetor);
        imprime3OuImpar(v, v2);
    }

}
