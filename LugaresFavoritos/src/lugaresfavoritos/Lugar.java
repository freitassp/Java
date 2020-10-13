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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samuel
 */
class Lugar {
    
    private String nome;
    private List<Integer> avaliacoes = new ArrayList<>();

    public Lugar(String nome) {
        this.nome = nome.toUpperCase();
    }
    
    
    

  public void mostraNoMapa() throws URISyntaxException, IOException  {
     String nomeEspacamento = this.nome.replace(" ", "%20");
       Desktop.getDesktop().browse(new URI("https://www.google.com/maps/search/?api=1&query="+nomeEspacamento));    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public List<Integer> getAvaliacoes() {
        return avaliacoes;
    }
    
    

    public void addAvaliacao(int nota) {
       avaliacoes.add(nota);
    }

   public Integer totalAvaliacoes() {
        return this.avaliacoes.size();
    }
  
  
  
  
  
  
    
}
