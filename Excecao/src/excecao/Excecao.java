/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecao;

/**
 *
 * @author Samuel
 */
public class Excecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[10];
       
        
       try {
           for (int i=0; i< 15; i++){
               System.out.println(array[i]);
           }
       } catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Caro amigo, você não pode acessar um indice maior do que o array!");
       }catch(Exception e){
           System.out.println("Puxa deu erro!" + e);
       }
        
        
        
        /*
        try {
           System.out.println(array[16]); 
        }catch (Exception e){
            System.out.println("Deu erro");
        }
        */
        
    }
    
}
