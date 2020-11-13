/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Samuel
 */
public class TestaCursoComAluno {
    
    
    public static void main(String[] args) {
        
        Curso javaColecoes = new Curso("Dominando as colecoes", "Samuel Freitas");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
        
        
        Aluno a1 = new Aluno("Samuel pr", 2525);
        Aluno a2 = new Aluno("Rebeca fr", 3333);
        Aluno a3 = new Aluno("raisa lt", 1111);
        
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        
        System.out.println("Todos alunos matriculados: ");
        
       
        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();
        
        while(iterator.hasNext()){
            
            Aluno proximo = iterator.next();
            System.out.println(proximo);
        }
        
        
        
        
//        javaColecoes.getAlunos().forEach(a -> {
//            System.out.println(a);
//        });// a partir d java 8
        
        
//        for (Aluno a : javaColecoes.getAlunos()) {
//            System.out.println(a);
//        } uma das formas de iterar


        
        
        
    }
    

    
}
