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
public class Ex_05_Potencia {
    
    public static int potencia(int a, int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return a;
        }
        return a * potencia(a, n-1);
    }
    
    public static void main(String[] args) {
        System.out.println(potencia(2, 5));
    }
}
