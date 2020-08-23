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
public class SitemaInterno {
    
    private int senha = 222;
    
    public void autentica(Autenticavel fa){
        
    boolean autenticou =   fa.autentica(this.senha);
    
    if(autenticou ){
        System.out.println("Acesso liberado");
    }else{
        System.out.println("Senha Invalida");
    }
    }
    
}
