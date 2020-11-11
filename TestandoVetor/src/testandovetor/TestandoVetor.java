/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandovetor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Samuel
 */
public class TestandoVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        int[] v = new int[30];
//        int[][] notas = new int[30][4];
//        
//        
//        for(int i=0; i<30; i++){
//            System.out.print(v[i]);
//        }
//        
//      System.out.println(v[10]);  

        List<String> listaNomes = new ArrayList<String>();
        listaNomes.add("Leoncio");
        listaNomes.add("Asdrubal");
        listaNomes.add("Mafalda");
//        listaNomes.remove(1);
//        listaNomes.remove("Leoncio");
        
        System.out.println(listaNomes.isEmpty());//verifica se lista esta vazia
        System.out.println(listaNomes.size());//verifica tamanho lista
        


        Iterator<String> itr = listaNomes.iterator();
        
         //enquanto tem um proximo elemento para iterar
        while (itr.hasNext()){
            
            String s = itr.next();//next = proximo
         
            if (s.equals("Mafalda")){
                itr.remove();
            }
            
             
        }
        System.out.println(listaNomes);
           

    }
    
}
