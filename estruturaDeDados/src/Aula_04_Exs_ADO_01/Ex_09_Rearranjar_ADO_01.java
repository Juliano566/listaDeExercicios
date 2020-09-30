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
public class Ex_09_Rearranjar_ADO_01 {

    public static void rearranjar(int a[]) {
        int pivo = a[0];
        int i = 1;
        int j = a.length - 1;

        while (i <= j) {
            if (a[i] <= pivo) {
                i++; // sobe o i
            } else if (a[j] > pivo) {
                j--; //desce o j
            } else {
                // troca
                Ex_03_TrocaMaiorMenor.troca(a, i, j);
                i++;
                j--;
            }
        }

        Ex_03_TrocaMaiorMenor.troca(a, 0, j);
    }

    public static void main(String[] args) {
        /*
        int n = Ex_01_BuscaLinear.lerInteiroPositivo();
        int a[] = Ex_01_BuscaLinear.lerVetorAleatorio(n);
        Ex_01_BuscaLinear.exibirVetor(a);
         */

        int v[] = {5, 6, 2, 7, 9, 1, 8, 3, 7};
        System.out.println("Vetor com os elementos particionados: ");
        rearranjar(v);
        Ex_01_BuscaLinear.exibirVetor(v);

    }
}
