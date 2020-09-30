/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_recursão;

/**
 *
 * @author Juliano
 */
public class Ex_10_Binario {

    public static int binario(int n) {
        if (n < 2) {
            return n;
        }
        return 10 * binario(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        System.out.print(binario(18));

    }
}
