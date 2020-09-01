/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytebank;

/**
 *
 * @author Samuel
 */
public class CalculadorDeImposto {
    private double totalImposto;
    
    
    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto+= valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }

    public void setTotalImposto(double totalImposto) {
        this.totalImposto = totalImposto;
    }
    
}
