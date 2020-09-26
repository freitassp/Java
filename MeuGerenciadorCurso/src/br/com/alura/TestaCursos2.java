/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Samuel
 */
public class TestaCursos2 {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colecoes", "Samuel Freitas");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);
      
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        
        
         Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javaColecoes.getTempoTotal());
    }

}
