package listadeexercicios04;

public class exe11 {
    
    static double mediaParVetor(int[] vetor) {
        double media = 0;
        int cont = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                media = media + vetor[i];
                cont++;
            }
            
        }
        media = media / cont;
        return media;
        
    }
    
    static void maiorMediaPar(int[] vetor, double media) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("[%d] --> %d ", i, vetor[i]);
            if (vetor[i] > media) {
                System.out.print("<-- Maior que a media");
            }
            System.out.println("");
            
        }
        System.out.printf("Media dos elementos de posição par: %.1f" , media);
        
    }
    
    public static void main(String[] args) {
        
        int t = exe01.tamanho();
        int[] vetor = exe01.criaVetor(t);
        double media = mediaParVetor(vetor);
        maiorMediaPar(vetor, media);
        
    }
}
