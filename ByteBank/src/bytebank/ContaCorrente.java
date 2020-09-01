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
public class ContaCorrente extends Conta implements Tributavel{
    
    
    public ContaCorrente(int agencia, int numero){
        
        super(agencia,numero);
        
    }

    @Override
    public boolean saca(double valor) {
        double sacaValor = valor + 0.20;
        return super.saca(sacaValor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deposita(double valor) {
       super.saldo +=  valor;
    }

    @Override
    public double getValorImposto() {
       return super.saldo * 0.01;
    }
    
    
    
}
