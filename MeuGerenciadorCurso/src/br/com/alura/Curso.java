/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 *
 * @author Samuel
 */
public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>(); // dado um umer inteiro me da um aluno, dado matricula me da aluno

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

   public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }
    
    public void adiciona(Aula aula){
        this.aulas.add(aula);
        
    }
    
    public int getTempoTotal(){
//        int tempoTotal = 0;
//        for (Aula aula : aulas) {
//            tempoTotal =+ aula.getTempo();
//        }
        
        //return tempoTotal;
      return this.aulas.stream().mapToInt(Aula::getTempo).sum();  
        
    }

   

 

    void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
        
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }
    
    @Override
    public String toString() {
        return "[ Curso:"+ this.nome + ", tempo total: "+ getTempoTotal()+ ", aulas: ["+ this.aulas +"] ] " ;
    } 

   public boolean estaMatriculado(Aluno a1) {
        
       return this.alunos.contains(a1);
       
    }

    public Aluno buscaMatriculado(int numero) {
        
//        for (Aluno aluno : alunos) {
//           
//            if(aluno.getMatricula() == numero)
//                return aluno;
//                
//            
//           
//            
//        }
//        
//     throw new NoSuchElementException("Matricula não encontada");
        if(!matriculaParaAluno.containsKey(numero))
            throw new NoSuchElementException();
        return matriculaParaAluno.get(numero);
    }

}
