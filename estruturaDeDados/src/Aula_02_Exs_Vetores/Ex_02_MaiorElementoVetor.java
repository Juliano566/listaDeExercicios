/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Exs_Vetores;

import Aula_01_Vetor.Ex_01_BuscaLinear;

/**
 *
 * @author Juliano
 */
public class Ex_02_MaiorElementoVetor {

    public static int lerMaiorVetor(int[] v) {
        int maior = 0;
        for (int i = 1; i < v.length; i++) {
            if (v[i] > v[maior]) {
                maior = i;
            }
        }

        return maior;
    }

    public static void main(String[] args) {

        int n = Ex_01_BuscaLinear.lerInteiroPositivo();
        int v[] = Ex_01_BuscaLinear.lerVetorAleatorio(n);
        Ex_01_BuscaLinear.exibirVetor(v);

        int x = lerMaiorVetor(v);
        System.out.println("O maior elemento do vetor esta no indice " + x);

    }

}
