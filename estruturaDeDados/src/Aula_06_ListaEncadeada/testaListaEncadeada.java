/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_ListaEncadeada;

/**
 *
 * @author Juliano
 */
public class testaListaEncadeada {

    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();
        System.out.println(lista);
        System.out.println(lista.isEmpty());
        
        lista.insereInicio(3);
        lista.insereInicio(5);
        lista.insereInicio(7);
        lista.insereInicio(9);
        
        System.out.println(lista);
        
        
        
        
        
    }

}
