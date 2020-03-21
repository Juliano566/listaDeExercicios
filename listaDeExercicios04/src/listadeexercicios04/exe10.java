package listadeexercicios04;

public class exe10 {

    static int multiplicaParVetor(int num, int[] vetor) {
        int mult = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 != 0) {
                mult = mult + vetor[i] * num;
            }
        }
        return mult;
        
    }

    static void imprimePar(int mult , int num) {
        System.out.printf("Multiplicação de todos os numeros em posição impar do vetor por %d: %d" ,num , mult);
    }

    public static void main(String[] args) {

        int t = exe01.tamanho();
        int num = exe07.numero();
        int[] vetor = exe01.criaVetor(t);
        exe01.imprimeVetor(vetor);
        int mult = multiplicaParVetor(num, vetor);
        imprimePar(mult,num);

    }

}
