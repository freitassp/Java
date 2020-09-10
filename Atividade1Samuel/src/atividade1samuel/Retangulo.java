/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1samuel;

/**
 *
 * @author Samuel
 */
public class Retangulo extends Poligono {
     
    private double base;
    private double altura;
    
    
    @Override
    public double calcularArea() {
        
        return base * altura;
        
    }

    @Override
    public void exibeDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
