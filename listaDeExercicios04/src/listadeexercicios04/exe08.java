package listadeexercicios04;

public class exe08 {
    
    static int verificaNumeroVetor(int[] vetor, int num) {
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == num) {
                cont++;
            }
        }
        return cont;
    }
    
    static void imprimeQuantidade(int cont, int num) {
        System.out.printf("Numero %d aparece %d vez(es)", num, cont);
    }
    
    public static void main(String[] args) {
        
        int t = exe01.tamanho();
        int num = exe07.numero();
        int[] vetor = exe01.criaVetor(t);
        exe01.imprimeVetor(vetor);
        int cont = verificaNumeroVetor(vetor, num);
        imprimeQuantidade(cont, num);
    }
    
}
