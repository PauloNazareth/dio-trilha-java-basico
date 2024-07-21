package br.com.bootcamp.parte_5.escopo;

public class Aula01 {
	/**
	 **Escopo
	 *Escopo pode ser entendido como o ambiente aonde uma variável pode ser acesssada.
	 *Em Java, o escopo vai de acordo com o bloco aonde ela foi declarada.
	 * */
	
	//Variavel da classe Conta
	double saldo = 10.0;
	
	public void sacar(Double valor) {
		//novoSaldo -> Variável local de método
		double novoSaldo = saldo - valor;
	}
	
	public void imprimirSaldo() {
		//Disponível em toda classe
		System.out.println(saldo);
		//Somente o método sacar conhece esta variável
//		System.out.println(novoSaldo);
	}
	
}
