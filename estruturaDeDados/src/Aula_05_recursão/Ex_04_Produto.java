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
public class Ex_04_Produto {
    
    public static int produto(int a, int b){
        if(b == 1){
            return a;
        }
        return produto(a, b-1) + a;
    }
    
    public static void main(String[] args) {
        
        int a = 4;
        int b = 5;
        System.out.println(produto(a, b));
    }
}
