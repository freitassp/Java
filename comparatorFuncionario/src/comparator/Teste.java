/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Samuel
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario("Samuel", 30);
        Funcionario f2 = new Funcionario("Rebeca", 20);
        Funcionario f3 = new Funcionario("White", 9);
        
        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        Iterator<Funcionario> iterador = funcionarios.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next().getNome());
        } 
    }



}
