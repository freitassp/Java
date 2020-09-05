/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bytebank.banco.modelo;

/**
 *
 * @author Samuel
 */
public class GuardadorDeContas {
    
    private Conta[] referencias;
    private int posicaoLivre;
    
    public GuardadorDeContas() {
        this.referencias = new Conta[10];
        this.posicaoLivre=0;
    }
    
    public void adiciona(Conta ref){
       this.referencias[this.posicaoLivre] = ref; 
       this.posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
        
    }

    public Conta getReferencia(int pos) {
        return this.referencias[pos];
        
    }

        
}
