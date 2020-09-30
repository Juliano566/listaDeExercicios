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
public class Ex_06_Soma_Digitos {
    
    public static int somaDigitos(int n){
        if(n < 10){
            return n;
        }
        return (n % 10) + somaDigitos(n/10);
        
    }
    
    public static void main(String[] args) {
        
        int n= 321;
        
        System.out.println(somaDigitos(n));
        
    }
}
