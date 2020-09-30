/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Exs_ADO_01;

import Aula_01_Vetor.Ex_01_BuscaLinear;
import static Aula_04_Exs_ADO_01.Ex_06exibeinterseccao.bubbleSort;

/**
 *
 * @author Juliano
 */
public class Ex_08_intercalar_ADO_01 {

    public static int[] intercalar(int a[], int b[]) {
        int[] c = new int[a.length + b.length];
        int i = 0; // vetor a
        int j = 0; // vetor b
        int k = 0; // vetor c

        while (k < c.length) {
            if (i == a.length) {
                c[k] = b[j];
                j++;
                k++;
            } else if (j == b.length) {
                c[k] = a[i];
                i++;
                k++;
            } else if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }

        }

        return c;
    }

    public static void main(String[] args) {
        /*
        int n = Ex_01_BuscaLinear.lerInteiroPositivo();
        int a[] = Ex_01_BuscaLinear.lerVetorAleatorio(n);
        bubbleSort(a);
        Ex_01_BuscaLinear.exibirVetor(a);

        int m = Ex_01_BuscaLinear.lerInteiroPositivo();
        int b[] = Ex_01_BuscaLinear.lerVetorAleatorio(m);
        bubbleSort(b);
        Ex_01_BuscaLinear.exibirVetor(b);
         */
        int n1[] = {1, 3, 7, 9, 11};
        int n2[] = {2, 5, 10, 12};

        System.out.println("Os vetor C com os elementos intercalados: ");
        int c[] = intercalar(n1, n2);

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

    }

}
