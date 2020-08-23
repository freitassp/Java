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
public class TesteSistema {
    
    public static void main(String[] args) {
        
        Gerente g = new Gerente();
        g.setSenha(222);
        
        Administrador adm = new Administrador();
        adm.setSenha(222);
        
        SitemaInterno si = new SitemaInterno();
        si.autentica(g);
        si.autentica(adm);
        
    }
    
}
