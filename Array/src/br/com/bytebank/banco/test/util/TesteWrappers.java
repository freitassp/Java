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
public class TesteWrappers {
    
    public static void main(String[] args) {
        
       
        
        int idade = 29; //Integer
        Integer inteiroRef = Integer.valueOf(29);
        int valor = inteiroRef.intValue();
        
        System.out.println(inteiroRef.doubleValue());
        
        System.out.println(Integer.MIN_VALUE);
        
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29);//Autoboxing
        
      // String s = args[0];
       //int numero = Integer.parseInt(s);
        //System.out.println(numero);
        
    }
    
}
