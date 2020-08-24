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
public class TestaContas {
    
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);
        
        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);
        
        
        cc.transfere(10.0, cp);
        
        System.out.println("CC: "+ cc.getSaldo());
        System.out.println("CP: "+ cp.getSaldo());
        
        
        
    }
    
}
