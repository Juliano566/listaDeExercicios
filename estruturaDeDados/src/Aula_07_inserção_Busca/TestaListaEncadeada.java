/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_07_inserção_Busca;

/**
 *
 * @author Juliano
 */
public class TestaListaEncadeada {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        System.out.println(lista);
        System.out.println(lista.isEmpty());

        lista.insereInicio(7);
        lista.insereInicio(5);
        lista.insereInicio(3);
        lista.insereInicio(1);
        System.out.println(lista);
        lista.insereFinal(9);
        lista.insereFinalR(12);
        System.out.println(lista);
        lista.insereOrdenadoR(0); //inserção no início
        System.out.println(lista);
        lista.insereOrdenadoR(8); //inserção entre 2 nós
        System.out.println(lista);
        lista.insereOrdenadoR(15); //inserção no final
        System.out.println(lista);
        System.out.println(lista.buscaLinearIT(9));
        System.out.println(lista.buscaLinearIT(666));
        System.out.println(lista.buscaLinearR(9));
        System.out.println(lista.buscaLinearR(666));
        System.out.println(lista.buscaLinearIT2(9).getElemento());
        System.out.println(lista.buscaLinearIT2(666));
        System.out.println(lista.buscaLinearR2(9));
        System.out.println(lista.buscaLinearR2(666));

    }
}
