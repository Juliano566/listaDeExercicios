package listadeexercicios04;

public class exe15 {

    static int[] vetorCrescente(int[] v) {
        int aux;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - 1; j++) {
                if (v[j] > v[j + 1]) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
        return v;
    }

    public static void main(String[] args) {

        int t = exe01.tamanho();
        int[] vetor = exe01.criaVetor(t);
        exe01.imprimeVetor(vetor);
        System.out.println("Vetor em ordem crescente: ");
        vetor = vetorCrescente(vetor);
        exe01.imprimeVetor(vetor);

    }

}
