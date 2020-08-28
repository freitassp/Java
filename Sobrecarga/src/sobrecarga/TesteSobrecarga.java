/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

import javax.swing.JOptionPane;


/**
 *
 * @author Samuel
 */
public class TesteSobrecarga {


    public static void main(String[] args) {
        // TODO code application logic here
        
        double n1,n2,n3,maior;
        
        //testando o primeiro metodo
        n1= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero:"));
        n2= Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero:"));
        ExemploSobreCarga e1 = new ExemploSobreCarga();
        maior = e1.calculaNumeroMaior(n1, n2);
        
        JOptionPane.showMessageDialog(null, "Maior numero digitador: " + maior);
        
        // testando o primeiro segundo metodo
        
        n1= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero:"));
        n2= Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero:"));
        n3= Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro numero:"));
        
        ExemploSobreCarga e2 = new ExemploSobreCarga();
        maior = e2.calculaNumeroMaior(n1, n2, n3);
        
        JOptionPane.showMessageDialog(null, "Maior numero digitado: " + maior);
        
        
    }
    
}
