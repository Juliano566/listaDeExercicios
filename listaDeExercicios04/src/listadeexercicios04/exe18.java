package listadeexercicios04;

public class exe18 {

    static int contador(int[] v, int num) {
        int cont = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == num) {
                cont++;
            }
        }

        return cont;

    }

    static void imprimeCont(int[] v, int cont, int num) {
        int[] v2 = new int[cont];
        int j = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == num) {
                v2[j] = i;
                j++;
            }
        }
        System.out.printf("Numero %d aparece %d veze(s)\n", num, cont);
        for (int i = 0; i < v2.length; i++) {
            System.out.printf("[%d] --> %d \n", v2[i], num);
        }

    }

    public static void main(String[] args) {

        int t = exe01.tamanho();
        int[] vetor = exe01.criaVetor(t);
        exe01.imprimeVetor(vetor);
        int num = exe07.numero();
        int cont = contador(vetor, num);
        imprimeCont(vetor, cont, num);

    }

}
