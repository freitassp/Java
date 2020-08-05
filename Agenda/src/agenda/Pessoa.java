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
public class Pessoa {
  String nome;
  String telefone;
  int idade;
  
    
public Pessoa(){
   this("","", 0);
    
}

public Pessoa(String nome, String telefone, int idade){
    this.setNome(nome);
    this.setTelefone(telefone);
    this.setIdade(idade);
    
    
}

    public Pessoa(Pessoa p) {
        this(p.getNome(), p.getTelefone(), p.getIdade());
    }

public String mostrarDados(){
   return  "----------------" + "\n"+ 
           "Nome:  "+ nome +"\n" + 
           "Telefone: " + telefone + "\n"+
           "Idade: " + idade + " anos. " ; 
           
}

  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



}



