/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

/**
 *
 * @author Samuel
 */
public class TestaAlunos {
    
    public static void main(String[] args) {
        
        Collection<String> alunos = new HashSet<>();
        alunos.add("Samuel Freitas");
        alunos.add("Rebeca Freitas");
        alunos.add("Johnny Freitas");
        alunos.add("Stephaie Freitas");
        alunos.add("Dejacira Freitas");
        alunos.add("Valtair Freitas");
        //alunos.add("Samuel Freitas"); nao aceita duplicar elementos
        
        
        boolean pingoEstaMatricuado = alunos.contains("Pingo");
        
        alunos.remove("Samuel Freitas");
        System.out.println(pingoEstaMatricuado);
        
        System.out.println(alunos.size());
        
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
        
       
                
                
                
        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });
        
        System.out.println(alunos);
        
        
        //truque para colocar alunos da colecao de conjuntos SET dentro de uma lista usando o construtor do Arraylist
        List<String> alunosEmLista = new ArrayList<>(alunos);
        
        
        
        
    }
    
    
    
}
