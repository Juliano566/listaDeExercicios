package listadeexercicios04;

public class exe05 {
    
    static double mediaVetor(int[] vetor) {
        double media = 0;
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            media = media + vetor[i];
            cont++;
        }
        
        media = media / cont;
        return media;
    }
    
    static void imprimeMediaVetor(double media) {
        System.out.printf("Media dos elementos do vetor: %.1f" , media);
    }
    
    public static void main(String[] args) {
        
        int t = exe01.tamanho();
        int[] vetor = exe01.criaVetor(t);
        exe01.imprimeVetor(vetor);
        double media = mediaVetor(vetor);
        imprimeMediaVetor(media);
        
    }
    
}
