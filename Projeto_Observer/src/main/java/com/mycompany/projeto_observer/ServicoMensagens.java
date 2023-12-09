/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luiiz
 */

// Classe Sujeito que mantém a lista de Observadores

public class ServicoMensagens {
    private List<Observador> observadores = new ArrayList<>();

    // Método para registrar Observadores
    void registrarObservador(Observador observador) {
        observadores.add(observador);
    }

    // Método para enviar uma nova mensagem e notificar Observadores
    void enviarMensagem(String mensagem) {
        System.out.println("Nova mensagem: " + mensagem);
        notificarObservadores(mensagem);
    }

    // Método para notificar todos os Observadores registrados
    private void notificarObservadores(String mensagem) {
        for (Observador observador : observadores) {
            observador.notificar(mensagem);
        }
    }
    
    
}
