/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

/**
 *
 * @author Samuel
 */
public class Teste {
    public static void main(String[] args) {
        
        GuardadorDeContas guardador = new GuardadorDeContas();
        
        Conta cc = new ContaCorrente(222, 2222);
        guardador.adiciona(cc);
        
        Conta cc2 = new ContaCorrente(222, 1202);
        guardador.adiciona(cc2);
        
        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);
        
        Conta ref = guardador.getReferencia(1);
        System.out.println(ref.getNumero());
        
        
    }
}
