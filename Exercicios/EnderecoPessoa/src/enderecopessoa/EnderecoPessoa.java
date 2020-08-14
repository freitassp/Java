/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enderecopessoa;

/**
 *
 * @author Samuel
 */
public class EnderecoPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa p = new Pessoa();
        p.nome = "Paulo";
        p.endereco = new Endereco();
        p.endereco.logradouro = "Avenida Brasil";
        p.endereco.bairro = "Centro";
     
        //p.endereco.logradouro  = "Aveninda XYZ";
        
         System.out.println(p.nome);
         System.out.println(p.endereco.logradouro);
         System.out.println(p.endereco.bairro);
    }
    
}
