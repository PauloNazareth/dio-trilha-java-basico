package com.bootcamp.abstracao;

public abstract class ServicoMensagemInstantanea {
	
	public void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
	
	public abstract void enviarMensagem();
	
	public abstract void receberMensagem();
	
}