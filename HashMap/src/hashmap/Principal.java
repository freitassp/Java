/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String, String> mapa = new HashMap();
        mapa.put("chave de fenda", "leve");
        mapa.put("martelo", "médio");
        mapa.put("marreta", "pesada");
        
        String ferramenta = JOptionPane.showInputDialog("Digite uma ferramenta:");
        String peso = mapa.get(ferramenta);
        if (peso != null){
            JOptionPane.showMessageDialog(null, peso);
            
        }else {
            JOptionPane.showMessageDialog(null, "não conheço");
        }
    }
    
}
