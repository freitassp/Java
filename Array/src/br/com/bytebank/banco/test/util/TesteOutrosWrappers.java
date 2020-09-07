/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samuel
 */
public class TesteOutrosWrappers {
    
    public static void main(String[] args) {
        
       
        
        int idade = 29; //Integer
        Integer inteiroRef = Integer.valueOf(29); //autoboxing
        int valor = inteiroRef.intValue();//unboxing
        
       Double dRef = Double.valueOf(3.2);//autoboxing
        System.out.println(dRef.doubleValue());//unboxing
        
        
        Boolean bRef = Boolean.TRUE;
        System.out.println(bRef.booleanValue());
        
        Number refNumero = Float.valueOf(29.9f);
        
        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(32.6);
        lista.add(25.6);
        lista.add(10.2f);
        
       
    }
    
}
