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
public class ListaEncadeada {

    private No ini;

    //Cria uma lista vazia
    public ListaEncadeada() {
        this.ini = null;
    }

    //Verifica se lista está vazia
    public boolean isEmpty() {
        return this.ini == null;
    }

    public void insereInicio(int elemento) {
        No novo = new No(elemento, ini);
        ini = novo;
    }

    @Override
    public String toString() {
        String strLista = "";
        No temp = ini;
        
        while (temp != null) {
            strLista = strLista + temp.getElemento() + " ";
            temp = temp.getProx();
        }
        return strLista;
    }

}
