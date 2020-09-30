/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_01_Vetor;

import java.util.Scanner;

/**
 *
 * @author Juliano
 */
public class Ex_01_BuscaLinear {

    public static int lerInteiroPositivo() {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Digite numero inteiro positivo: ");
            n = sc.nextInt();
        } while (n < 0 || n >= 1000000);
        return n;
    }

    public static int[] lerVetor(int n) {
        int v[] = new int[n];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < v.length; i++) {
            System.out.printf("V[%d] = ", i);
            v[i] = sc.nextInt();
        }
        return v;
    }

    public static int[] lerVetorAleatorio(int n) {
        int v[] = new int[n];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 50);
        }
        return v;
    }

    public static void exibirVetor(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }

    public static boolean buscaLinear(int[] v, int x) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = lerInteiroPositivo();
        int v[] = lerVetor(n);
        exibirVetor(v);
        System.out.println("Numero que deseja buscar :");
        int x = sc.nextInt();

        if (buscaLinear(v, x)) {
            System.out.printf("%d está no vetor \n", x);
        } else {
            System.out.printf("%d não esta no vetor \n", x);
        }

    }
}
