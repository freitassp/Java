/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author Samuel
 */
public class Fisica extends Pessoa{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String mostrarDados(){
   return  "----------------" + "\n"+ 
           "Nome:  "+ nome +"\n" + 
           "Telefone: " + telefone + "\n"+
           "Idade: " + idade + " anos. "+"\n"+
           "CPF: " + cpf; 
           
}

    
}
