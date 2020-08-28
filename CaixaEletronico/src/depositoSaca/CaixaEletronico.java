/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depositoSaca;

/**
 *
 * @author Samuel
 */
public class CaixaEletronico {

    double dinheiro;

    public void depositar(double dinheiro) {
        this.dinheiro += dinheiro;
        System.out.println("Depósito realizado com sucesso");

    }

    public void sacar(double dinheiro) {

        if (dinheiro > this.dinheiro) {
            System.out.println("O caixa não possui essa quantia");
        } else {
            this.dinheiro -= dinheiro;
            System.out.println("Saque realizado com sucesso");
        } 
       
      }    

    public static void main(String[] args) {

        CaixaEletronico caixa = new CaixaEletronico();
        caixa.depositar(300);
        caixa.depositar(100);
        caixa.sacar(300);
        caixa.sacar(100);

    }




    
}
