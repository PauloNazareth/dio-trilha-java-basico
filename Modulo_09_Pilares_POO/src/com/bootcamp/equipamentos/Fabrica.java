package com.bootcamp.equipamentos;

import com.bootcamp.equipamentos.copiadora.Copiadora;
import com.bootcamp.equipamentos.digitalizar.Digitalizadora;
import com.bootcamp.equipamentos.impressora.Deskjet;
import com.bootcamp.equipamentos.impressora.Impressora;
import com.bootcamp.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
//		Impressora impressora = new Deskjet();
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}
