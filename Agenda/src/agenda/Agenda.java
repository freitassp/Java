/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author Samuel
 */
public class Agenda {

    public static void main(String[] args) {
      
       Impressora i1 = new Impressora();
       Impressora i2 = new Laser();
       Impressora i3 = new JatoDeTinta();
        
       i1.imprimir();
       i2.imprimir();
       i3.imprimir();
        
        
    
       /* 
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Samuel", "(44) 99868-7250 ", 30);
        Fisica p3 = new Fisica();
        
        p1.setNome("Rebeca");
        p1.setTelefone("(44)9873-5346");
        p1.setIdade(20);
        p3.setNome("Jose");
        
       p3.setNome("Jose");
       p3.setCpf("055854");
        
        System.out.println(p1.mostrarDados());
        System.out.println(p2.mostrarDados());
        System.out.println(p3.mostrarDados());

        
        System.out.println();
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        */
      
        
    }
    
}
