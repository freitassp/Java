/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicesumar.ead.java;

/**
 *
 * @author Samuel
 */
public abstract class Botao {

    private boolean clicado;
       
       protected boolean isClicado() {
           return clicado;
       }
      
      protected void setClicado(boolean clicado) {
         if (!this.isClicado()){
             this.clicado = clicado;
         }
     }
     
     protected abstract void resetBotao();
 }