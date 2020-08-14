/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

/**
 *
 * @author Samuel
 */
public class AcessoRestrito {

    public static void acessar(boolean a, boolean b, boolean c, boolean d) {
        boolean temAcesso = !(a || d) && c && ((a && (!b || d)) || c);
        if (temAcesso) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");

        }

    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        acessar(true, true, true, true);
        acessar(true, false, true, false);
        acessar(false, true, true, false);
        acessar(false, true, false, true);
        acessar(false, false, false, false);
    }
}
