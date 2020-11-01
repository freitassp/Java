/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author Samuel
 */
public class TestePerformanceSet {
    
    public static void main(String[] args) {
        
        //Alternar entre list e set para ver a diferença de velocidade e ver como set e bem mais rapido
        
        Collection<Integer> numeros = new ArrayList<>();
        
        //Collection<Integer> numeros = new HashSet<>();
        
        long inicio = System.currentTimeMillis();
        
        for(int i=1; i<=50000; i++){
            numeros.add(i);
        }
        
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }
        
        long fim = System.currentTimeMillis();
        
        long tempoDeExecucao = fim - inicio;
        
        System.out.println("Tempo gasto: "+ tempoDeExecucao);
    }
    
}
