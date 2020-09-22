/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.samuel.cursoAlura;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Samuel
 */
public class TestandoListas {
    
    public static void main(String[] args) {
        
        ArrayList<String> cursos = new ArrayList<>();
        cursos.add("Java");
        cursos.add("Html e CSS");
        cursos.add("JavaScript");
        
        //cursos.remove("JavaScript");
        System.out.println(cursos);
        
//        Collections.sort(cursos);
//        System.out.println("Ordenado: "+cursos);

        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("Aula : " + cursos.get(i));
        }
        System.out.println("");
        for (String curso : cursos) {
            System.out.println("For each laço: " + curso);
            
        }
        
        System.out.println("");
        
        cursos.forEach(aula -> {
            System.out.println("Percorrendo "+ aula);
        });

        
        //System.out.println("O primeiro curso da lista eh o: " + cursos.get(0));
        
    }
    
}
