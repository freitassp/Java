/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Samuel
 */
public class TesteArrayList {
    
    public static void main(String[] args) {
        //Generics
        List<Conta> lista = new ArrayList<Conta>();
        
        Conta cc = new ContaCorrente(222, 2222);
        lista.add(cc);
        
        Conta cc2 = new ContaCorrente(222, 1202);
        lista.add(cc2);
        
        System.out.println("Tamanho: "+ lista.size());
        
       Conta  ref = lista.get(0);
       
        System.out.println(ref.getNumero());
        
        lista.remove(0);
        System.out.println("Tamanho: "+ lista.size());
        
           Conta cc3 = new ContaCorrente(44, 444);
        lista.add(cc3);
        
        Conta cc4 = new ContaCorrente(55, 555);
        lista.add(cc4);
        
        
        for(int i=0; i<lista.size(); i++){
           Object oRef = lista.get(i);
            System.out.println(oRef);
              }
            System.out.println("-------");
            
        for( Conta oRef : lista){
            System.out.println(oRef);
      
        }
        
    }
    
}
