package com.mastersoft.lanchonete;

import com.mastersoft.lanchonete.area.cliente.Cliente;
import com.mastersoft.lanchonete.atendimento.Atendente;
import com.mastersoft.lanchonete.atendimento.cozinha.Almoxarife;
import com.mastersoft.lanchonete.atendimento.cozinha.Cozinheiro;

//Exemplos de Modificadores de Visibilidade
public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
	
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Atendente atendente = new Atendente();
		atendente.servindoMesa();
		atendente.receberPagamento();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
	}
}
