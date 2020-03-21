/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package julianocastroado1;

import javax.swing.JOptionPane;

/**
 *
 * @author juliano.scastro
 */
public class JulianoCastroADO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        cachorro cachorro01 = new cachorro();
        cachorro01.setNome("Max");
        cachorro01.setCor("Preto");
        cachorro01.setIdade(6);

        cachorro cachorro02 = new cachorro();
        cachorro02.setNome("Rex");
        cachorro02.setCor("Branco");
        cachorro02.setIdade(5);

        JOptionPane.showMessageDialog(null, "Nome: " + cachorro01.getNome() + "\n"
                                          + "Cor:  " + cachorro01.getCor() + "\n"
                                          + "Idade: " + cachorro01.getIdade() + "\n\n"
                      
                                          + "Nome: " + cachorro02.getNome() + "\n"
                                          + "Cor:  " + cachorro02.getCor() + "\n"
                                          + "Idade: " + cachorro02.getIdade());

        
        



    }

}
