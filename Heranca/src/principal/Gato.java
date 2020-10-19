/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.logging.Logger;

/**
 *
 * @author Samuel
 */
public class Gato extends Animal {
    
    public Gato(){
        this.setTipo("Mamifero");
        
    }

    @Override
    public void som() {
        System.out.println("Miau");
    }
    
   
    
    
}
