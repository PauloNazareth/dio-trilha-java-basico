package br.com.bootcamp.parte_4.condicao_ternaria;

public class ResultadoEscolar {

	public static void main(String[] args) {
		int nota = 6;
		String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}
}
