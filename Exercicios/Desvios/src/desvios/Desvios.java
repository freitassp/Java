/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desvios;

/**
 *
 * @author Samuel
 */
public class Desvios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i = 0; i < 12; i++) {
            if (i % 3 == 0) continue;
            if (i % 5 == 0) break;
            if (i % 7 == 0) continue;

            System.out.print(i + " ");
        }
        
    }
    
}
