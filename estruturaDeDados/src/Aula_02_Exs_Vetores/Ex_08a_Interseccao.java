/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Exs_Vetores;

import Aula_01_Vetor.Ex_01_BuscaLinear;

/**
 *
 * @author Juliano
 */
public class Ex_08a_Interseccao {
    
    public static int inters2Vetores(int[] v1, int[] v2, int[] inter){
        int k = 0;
        for (int i = 0; i < v1.length; i++) {
            if(Ex_01_BuscaLinear.buscaLinear(v2, v1[i])){
                inter[k] = v1[i];
                k++;
            }
        }
        return k;
    }
    
    
    public static void main(String[] args) {
        
        int n1 = Ex_01_BuscaLinear.lerInteiroPositivo();
        int v1[] = Ex_01_BuscaLinear.lerVetorAleatorio(n1);
        Ex_01_BuscaLinear.exibirVetor(v1);
        
        int n2 = Ex_01_BuscaLinear.lerInteiroPositivo();
        int v2[] = Ex_01_BuscaLinear.lerVetorAleatorio(n2);
        Ex_01_BuscaLinear.exibirVetor(v2);
        
        int inter[] = new int[n1];
        
        int n3 = inters2Vetores(v1, v2, inter);

        Ex_05_Inserercao.exibirVetorTam(inter, n3);
        
    }
}
