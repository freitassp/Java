/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lugaresfavoritos;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author Samuel
 */
public class LugaresFavoritos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws URISyntaxException, IOException {
        // TODO code application logic here

        Lugar cidade = new Lugar("NovaEsperança PR");
        //cidade.setNome("maringa PR");
        //Lugar lojaInformatica = new Lugar("Cybertec Informatica");

//        cidade.mostraNoMapa();
//        lojaInformatica.mostraNoMapa();
//       String nome = cidade.getNome();
//        System.out.println(nome);


         cidade.addAvaliacao(5);
         cidade.addAvaliacao(4);
         
         Integer total = cidade.totalAvaliacoes();
        System.out.println(total);
         
        // System.out.println(cidade.getAvaliacoes().size());

    }

}
