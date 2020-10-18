/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import View.Login;
import controller.helper.LoginHelper;
import model.Usuario;

/**
 *
 * @author Samuel
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    
    public void entrarNoSistema(){
        //pegar usuario da view
        
      Usuario usuario =  helper.obterModelo();
        
        //pesquisa usuaro no banco
        //se o usuario da view iver mesmo usuario e senha do usario vindo do banco eu vou redirecionar para menu
        //senao vou mostra para usuario usuario senha invalivo
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo no banco de dados");
        
        this.view.exibeMensagem("Executei fiz tarefa");
    }
    
}
