package listadeexercicios04;

public class exe17 {
    
    static int mulVetor(int[] v, int num) {
        int somaV = 0;
        
        for (int i = 0; i < v.length; i++) {
            somaV = somaV + v[i];
        }
        somaV = somaV * num;
        return somaV;
    }
    
    static void imprimeMulVetor(int soma, int num) {
        System.out.printf("Todos elementos do vetor multiplicador por %d: %d \n", num, soma);
    }
    
    public static void main(String[] args) {
        
        int t = exe01.tamanho();
        int[] vetor = exe01.criaVetor(t);
        exe01.imprimeVetor(vetor);
        int num = exe07.numero();
        int soma = mulVetor(vetor, num);
        imprimeMulVetor(soma, num);
        
    }
}
