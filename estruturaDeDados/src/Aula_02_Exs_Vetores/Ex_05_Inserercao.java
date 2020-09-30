/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Exs_Vetores;

import Aula_01_Vetor.Ex_01_BuscaLinear;
import java.util.Scanner;

/**
 *
 * @author Juliano
 */
public class Ex_05_Inserercao {

    public static int posicaoVetor(int n) {
        Scanner sc = new Scanner(System.in);
        int p;
        do {
            System.out.print("Digite um indice do vetor: ");
            p = sc.nextInt();

        } while (p > n);

        return p;
    }

    public static void lerVetorAleatorioTam(int v[], int n) {
        for (int i = 0; i < n; i++) {
            v[i] = (int) (Math.random() * 50);
        }
    }

    public static void exibirVetorTam(int v[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }

    public static int incercao(int[] v, int n, int num, int p) {
        for (int i = n; i > p; i--) {
            v[i] = v[i - 1];
        }
        v[p] = num;
        return n + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v[] = new int[30];
        int n = Ex_01_BuscaLinear.lerInteiroPositivo();// n <= 30
        lerVetorAleatorioTam(v, n);
        exibirVetorTam(v, n);

        int p = posicaoVetor(n);
        int num;

        System.out.printf("Elemento para inserir no vetor: ");
        num = sc.nextInt();

        int novoN = incercao(v, n, num, p);
        exibirVetorTam(v, novoN);
    }

}
