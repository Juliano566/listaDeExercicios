package listadeexercicios04;

import java.util.Scanner;

public class exe07 {
    
    static Scanner sc = new Scanner(System.in);
    
    static int numero() {
        System.out.print("Digite um numero inteiro: ");
        int num = sc.nextInt();
        return num;
    }
    
    static int[] mulElementoVetor(int[] vetor, int num) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor[i] * num;
        }
        return vetor;
    }
    
    static void vetorMul(int num) {
        System.out.println("Cada elemento do vetor multiplicado por: " + num);
    }
    
    public static void main(String[] args) {
        
        int t = exe01.tamanho();
        int num = numero();
        int[] vetor = exe01.criaVetor(t);
        exe01.imprimeVetor(vetor);
        vetor = mulElementoVetor(vetor, num);
        vetorMul(num);
        exe01.imprimeVetor(vetor);
        
    }
    
}
