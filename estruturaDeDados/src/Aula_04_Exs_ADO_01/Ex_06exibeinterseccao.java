/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Exs_ADO_01;

import Aula_01_Vetor.Ex_01_BuscaLinear;
import Aula_03_Desempenho.Ex_03_TrocaMaiorMenor;

/**
 *
 * @author Juliano
 */
public class Ex_06exibeinterseccao {

    public static void exibeInters2Vetores(int a[], int b[]) {
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                System.out.print(a[i] + " ");
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    Ex_03_TrocaMaiorMenor.troca(a, j, i + 1);
                }
            }
        }

    }

    public static void main(String[] args) {
        /*
        int n = Ex_01_BuscaLinear.lerInteiroPositivo();
        int a[] = Ex_01_BuscaLinear.lerVetorAleatorio(n);
        bubbleSort(a);
        Ex_01_BuscaLinear.exibirVetor(a);

        int b[] = Ex_01_BuscaLinear.lerVetorAleatorio(n);
        bubbleSort(b);
        Ex_01_BuscaLinear.exibirVetor(b);
         */
        int n1[] = {1, 2, 3, 5, 9, 11};
        int n2[] = {1, 4, 5, 9, 11, 12};

        System.out.println("Os elementos iguais de A e b são: ");
        exibeInters2Vetores(n1, n2);

    }

}
