/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.List;

/**
 *
 * @author Samuel
 */
public class TestaCurso {
    public static void main(String[] args) {
        
        Curso javaColecoes = new Curso("Dominando as colecoes", "Samuel Freitas");
        
       // List<Aula> aulas = javaColecoes.getAulas();
        
      //javaColecoes.getAulas().add(new Aula("Trabalhando com Colecoes",20));
       
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        System.out.println(javaColecoes.getAulas());
        
        
        
    }
    
}
