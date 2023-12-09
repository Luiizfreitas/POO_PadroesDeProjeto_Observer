/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_observer;

/**
 *
 * @author luiiz
 */
public class CaixaEntrada implements Observador{
    private String nome;

    CaixaEntrada(String nome) {
        this.nome = nome;
    }

    // Método chamado quando o Observador é notificado
    @Override
    public void notificar(String mensagem) {
        System.out.println(nome + " recebeu a mensagem: " + mensagem);
    }
}
