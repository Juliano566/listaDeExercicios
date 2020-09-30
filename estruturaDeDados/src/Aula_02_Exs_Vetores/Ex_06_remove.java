/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Exs_Vetores;

import Aula_01_Vetor.Ex_01_BuscaLinear;
import static Aula_02_Exs_Vetores.Ex_05_Inserercao.exibirVetorTam;
import static Aula_02_Exs_Vetores.Ex_05_Inserercao.lerVetorAleatorioTam;
import static Aula_02_Exs_Vetores.Ex_05_Inserercao.posicaoVetor;
import java.util.Scanner;

/**
 *
 * @author Juliano
 */
public class Ex_06_remove {

    public static void remover(int v[], int p, int n) {
        for (int i = p; i <= n; i++) {
            v[i] = v[i + 1];
        }
    }

    public static int buscaLinearTam(int v[], int x, int n) {
        for (int i = 0; i < n; i++) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v[] = new int[30];
        int n = Ex_01_BuscaLinear.lerInteiroPositivo();// n <= 30
        lerVetorAleatorioTam(v, n);
        exibirVetorTam(v, n);

        System.out.println("Digite um número que deseja remover: ");
        int x = sc.nextInt();

        int p = buscaLinearTam(v, x, n);

        if (p != -1) {
            remover(v, p, n);
            exibirVetorTam(v, n - 1);
        }
        
        else{
            System.out.printf("Elemento %d não esta no vetor " , x);
        }

    }

}
