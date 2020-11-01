/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

/**
 *
 * @author Samuel
 */
public class TestaAlunosNoCurso {
    
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colecoes", "Paulo Silveira");
        
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 18));
        javaColecoes.adiciona(new Aula("Criado uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modeando com coleçoes", 22));
        
        Aluno a1 = new Aluno("Samuel Freitas", 2555);
        Aluno a2 = new Aluno("Rebeca Freitas", 1222);
        Aluno a3 = new Aluno("Modelando colecoes",3222);
        
        javaColecoes.matricula(a1);
        
    }
    
}
