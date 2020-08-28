/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

/**
 *
 * @author Samuel
 */
public class ExemploSobreCarga {
    
    double maior;
    
    public double calculaNumeroMaior(double n1, double n2){
        
        if(n1 == n2){
            maior = 0;
        }else if(n1 > n2){
            maior = n1;
        }else{
            maior=n2;
        }
        return maior;
        
        
    }
    
    public double calculaNumeroMaior(double n1, double n2, double n3){
        if((n1 > n2) &&(n1 > n3)){
            maior= n1;
        }else if ((n2 > n1) && (n2 > n3)){
            maior= n2;
            
        }else if((n3 > n1) && (n3 > n2)){
            
            maior = n3;
        }else{
            maior =0;
        }
        return maior;
        
    }
        
       
}