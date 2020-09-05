/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import java.util.ArrayList;

/**
 *
 * @author Samuel
 */
public class TesteArrayListEquals {
    
    public static void main(String[] args) {
        
//      Conta cc = new ContaCorrente(222, 2222);
//        
//       Conta cc2 = new ContaCorrente(222, 2222);
//        
//        boolean ehIgual = cc.ehIgual(cc2);
//       System.out.println("Eh igual "+ ehIgual);
        
     //   Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();
        
        Conta cc = new ContaCorrente(222, 2222);
        lista.add(cc);
        
        Conta cc2 = new ContaCorrente(222, 1202);
        lista.add(cc2);
        
       Conta cc3 = new ContaCorrente(222, 1202); 
       boolean existe = lista.contains(cc2);
       
        System.out.println("Ja existe? "+ existe);
         
        for( Conta oRef : lista){
            System.out.println(oRef);
      
        }
        
    }
    
}
