package com.bootcamp.equipamentos.multifuncional;

import com.bootcamp.equipamentos.copiadora.Copiadora;
import com.bootcamp.equipamentos.digitalizar.Digitalizadora;
import com.bootcamp.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

	@Override
	public void copiar() {
		System.out.println("Copiando via Multifuncional...");
	}

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando via Multifuncional...");
	}

	@Override
	public void imprimir() {
		System.out.println("Imprimindo via Multifuncional...");
	}

}
