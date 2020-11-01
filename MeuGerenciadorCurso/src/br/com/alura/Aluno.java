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
public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        
        if(nome == null){
            throw new NullPointerException("Nome não pode ser NULL");
        }
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return this.nome.equals(outro.nome);
        
    }

    @Override
    public int hashCode() {
        return this.nome.charAt(0);
    }

    
    
    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", matricula: "+ this.matricula +"]";
    }

    
    
    
    
}
