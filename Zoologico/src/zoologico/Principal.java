/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

import dados.Animal;

/**
 *
 * @author Samuel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal leao = new Animal();
        Animal cavalo  = new Animal();
        
        leao.emiteSom();
        cavalo.emiteSom();
        
    }
    
}
