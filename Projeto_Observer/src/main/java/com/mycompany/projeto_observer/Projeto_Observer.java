/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_observer;

/**
 *
 * @author luiiz
 */
public class Projeto_Observer {

    public static void main(String[] args) {
                
        // Criando um serviço de mensagens (Sujeito)
        ServicoMensagens servicoMensagens = new ServicoMensagens();

        // Criando observadores (Caixas de Entrada)
        Observador caixaEntrada1 = new CaixaEntrada("Caixa 1");
        Observador caixaEntrada2 = new CaixaEntrada("Caixa 2");

        // Registrando observadores no serviço de mensagens
        servicoMensagens.registrarObservador(caixaEntrada1);
        servicoMensagens.registrarObservador(caixaEntrada2);

        // Enviando uma nova mensagem (notificando observadores)
        servicoMensagens.enviarMensagem("Olá, mundo!");
        
    }
}
