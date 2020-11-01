/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.Set;

/**
 *
 * @author Samuel
 */
public class Matriculando {
    
    public static void main(String[] args) {
        Curso cursos = new Curso("Orientacao a objetos", "Samuel Prieto" );
        
        cursos.adiciona(new Aula("Introdção a OOP", 22));
        cursos.adiciona(new Aula("Primeiro codigo  OOP", 25));
        
        Aluno a1 = new Aluno("Beca", 1214);
        Aluno a2 = new Aluno("Rafa", 1114);
        
        cursos.matricula(a2);
        cursos.matricula(a1);
        
        
        
        System.out.println("Todos alunos matriculados: ");
        
        cursos.getAlunos().forEach(aluno ->{
            System.out.println(aluno);
        });
        
        
//        Set<Aluno> alunos = cursos.getAlunos();
//        alunos.add(a2);//nao pode ser alterado

//        Set<String> nomes = cursos.emptySet();
//        nomes.add("Paulo");
        System.out.println("O aluno "+ a1 + " esta matriculado: ");
        System.out.println(cursos.estaMatriculado(a1));
        
       
        Aluno rafa = new Aluno("Rafa", 1114);
        System.out.println("Esse rafa esta matriculado?");
        System.out.println(cursos.estaMatriculado(rafa));
        
        System.out.println("O a2 e equals ao rafa");
        System.out.println(a2.equals(rafa));
    }        

    
}
