package listadeexercicios04;

import java.util.Scanner;

public class exe21 {

    static Scanner sc = new Scanner(System.in);

    static int quantidadeAlunos() {
        int t;
        System.out.print("Quantidade de alunos: ");
        t = sc.nextInt();
        return t;
    }

    static int[] maiorMedia(int[] v, double m) {
        int[] v2;
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > m) {
                cont++;
            }
        }
        v2 = new int[cont + 1];
        cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > m) {
                v2[cont] = i;
                cont++;
            }
        }
        return v2;
    }

    static void imNomeMaior(int[] v, String[] n) {
        int cont = 0;
        System.out.println("Alunos com idade acima da media: ");
        for (int i = 0; i < n.length; i++) {
            if (v[cont] == i) {
                System.out.println(n[i]);
                cont++;
            }
        }
    }

    public static void main(String[] args) {

        int t = quantidadeAlunos();
        String[] vNome = new String[t];
        int[] vIdade = new int[t];
        for (int i = 0; i < t; i++) {
            System.out.print("Nome: ");
            vNome[i] = sc.next();

            System.out.print("Idade: ");
            vIdade[i] = sc.nextInt();
            System.out.println("");
        }
        double media = exe05.mediaVetor(vIdade);
        System.out.println("Media de idade da sala: " + media);
        int[] v2 = maiorMedia(vIdade, media);
        imNomeMaior(v2, vNome);

    }
}
