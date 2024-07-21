package br.com.bootcamp.parte_4.metodos;

public class Aula01 {

	/**
	 ** Métodos
	 * Métodos, correspondem a funções e sub-rotinas 
	 * Todas as ações das aplicações são consideradas métodos. 
	 * */
	
	////Exemplos
//	somar(int n1, int n2){}
//	abrirConexao(){}
//	concluirProcessamento(){}
//	findById(int id){}
//	calcularImprimir(){} //Conflito da Proposta, pois recomenda-se que tenha que ter uma unica responsábilidade
	
	public double somar(int num1, int num2) {
		//Implementa Lógica - Finalidade do Método
		return num1+num2;
	}
	
	public void imprimir(String texto) {
		//Implementa Lógica - Finalidade do Método
		//void - informa que o método não tem Retorno
	}
	
	//throws Exception  : indica que o método ao ser utilizado pode gerar uma exceção
	public double dividir(int dividendo, int divisor) throws Exception {
		return dividendo / divisor;
	}
	
	//Método não vísivel a outras classes
	private void metodoPrivado() {}
}
