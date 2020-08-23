/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancainterface;

/**
 *
 * @author Samuel
 */
public class Cliente implements Autenticavel{

    private int senha;
    
    @Override
    public void setSenha(int senha) {
        this.senha = senha;
        
    }

    @Override
    public boolean autentica(int senha) {
        
        if(this.senha == senha){
            return true;
        }else {
            return false;
        }
    }
    
    
    
}
