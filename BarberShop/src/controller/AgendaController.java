/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.DAO.AgendamentoDAO;
import View.Agenda;
import controller.helper.AgendaHelper;
import java.util.ArrayList;
import model.Agendamento;

/**
 *
 * @author Samuel
 */
public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
        
        //buscar uma lista com agndamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        // exibir esta lista na view
        helper.preencherTabela(agendamentos);
        
        
    }

    
    
}
