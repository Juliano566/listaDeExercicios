/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_01_Vetor;

/**
 *
 * @author Juliano
 */
public class Ex_04_Inverter {

    public static int[] inverterVetor(int v[]) {
        int aux;
        for (int i = 0; i < v.length / 2; i++) {
            aux = v[i];
            v[i] = v[v.length - i - 1];
            v[v.length - i - 1] = aux;

        }
        return v;
    }

    public static void main(String[] args) {

        int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        v = inverterVetor(v);

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

    }
}
