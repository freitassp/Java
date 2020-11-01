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
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });
        
        
        
        
    }
    

    
}
