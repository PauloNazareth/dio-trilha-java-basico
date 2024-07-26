package br.com.bootcamp.parte_4.estrutura_while;

import java.util.concurrent.ThreadLocalRandom;

public class EstruturaWhile {
	
	/**
	 * #Estrutura do controle de fluxo while
	 * while (expressão booleana de validação) {
	 * // comando que será executado até que a expressão de validação torne-se falsa 
	 * }
	 */
	public static void main(String[] args) {
		double mesada = 50.0;
        while(mesada>0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
	}
	
	private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2, 8);
	}
}