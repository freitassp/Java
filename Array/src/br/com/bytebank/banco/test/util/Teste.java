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
public class Teste {
    
    public static void main(String[] args) {
        
        ArrayList lista = new ArrayList();
        
        Conta cc = new ContaCorrente(222, 2222);
        lista.add(cc);
        
        Conta cc2 = new ContaCorrente(222, 1202);
        lista.add(cc2);
        
        System.out.println(lista.size());
        
       Conta  ref = (Conta)lista.get(0);
       
        System.out.println(ref.getNumero());
        
        lista.remove(0);
        
    }
    
}
