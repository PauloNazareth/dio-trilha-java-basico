package com.bootcamp.encapsulamento;

import com.bootcamp.heranca.Veiculo;

public class Carro extends Veiculo {
	public void ligar() {
		conferirCombustivel();
		conferirCambio();
		System.out.println("Carro Ligado!");
	}
	
	private void conferirCombustivel() {
		System.out.println("-> Conferindo Combustivel...");
	}
	
	private void conferirCambio() {
		System.out.println("-> Conferindo Cambio...");
	}
}
