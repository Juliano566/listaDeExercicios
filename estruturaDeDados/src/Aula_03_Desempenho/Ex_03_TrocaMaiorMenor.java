/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03_Desempenho;

import Aula_01_Vetor.Ex_01_BuscaLinear;

/**
 *
 * @author Juliano
 */
public class Ex_03_TrocaMaiorMenor {

    public static void troca(int[] v, int posMenor, int posMaior) {
        int aux = v[posMenor];
        v[posMenor] = v[posMaior];
        v[posMaior] = aux;
    }

    public static void trocaMaiorMenor(int[] v) {
        int posMaior = 0;
        int posMenor = 0;

        for (int i = 1; i < v.length; i++) {
            if (v[i] > v[posMaior]) {
                posMaior = i;
            } else {
                if (v[i] < v[posMenor]) {
                    posMenor = i;
                }
            }
        }
        troca(v, posMenor, posMaior);

    }

    public static void main(String[] args) {

        int n = Ex_01_BuscaLinear.lerInteiroPositivo();
        int v[] = Ex_01_BuscaLinear.lerVetorAleatorio(n);
        Ex_01_BuscaLinear.exibirVetor(v);

    }

}
