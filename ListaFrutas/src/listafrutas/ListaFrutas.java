/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listafrutas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Samuel
 */
public class ListaFrutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> listaFrutas = new ArrayList<String>();
        String s = "uva";
        listaFrutas.add("melancia");
        listaFrutas.add(s);
        listaFrutas.add("caju");
        
        String saida = "";
        
        saida += "Frutas da lista: "+ listaFrutas.toString();
        saida += "\nTotal de Frutas da lista: "+ listaFrutas.size();
        saida += "\nA lista possui pera: "+ listaFrutas.contains("pera");
        saida += "\nA lista possui pera: "+ listaFrutas.contains("caju");
        saida += "\nIndice da Fruta caju na lista " + listaFrutas.indexOf("caju");
        
        listaFrutas.remove("uva");
        
         saida += "\nFrutas da lista: "+ "após remover uva "+listaFrutas.toString();
         saida += "\nTotal de Frutas da lista "+ "após remover uva: "+ listaFrutas.size();
         saida += "\nindice da Fruta caju na lista apos remover uva:" + listaFrutas.indexOf("caju");
         
         
         JTextArea saidaArea = new JTextArea();
         saidaArea.setText(saida);
         JOptionPane.showMessageDialog(null, saidaArea, "Trabalhando com ArrayList", JOptionPane.INFORMATION_MESSAGE);
         
         System.exit(0);
         
         
        
        
        
        
        
    }
    
}
