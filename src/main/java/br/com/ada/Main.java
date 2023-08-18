package br.com.ada;

import br.com.ada.model.Contato;

public class Main {
    public static void main(String[] args) {
        Agenda agenda= new Agenda();
        agenda.adicionarContato(new Contato());
        System.out.println("Hello and welcome!");
    }
}