package br.com.bootcamp.parte_3.break_continue;

public class BreakContinue {

	public static void main(String[] args) {
		//Exemplo Estrutura com Break 
		for(int numero = 1; numero <=5; numero ++){
			if(numero==3)
				break;
			System.out.println(numero);
		}
		
		System.out.println();
		
		//Exemplo Estrutura com Continue 
		for(int numero = 1; numero <=5; numero ++){
			if(numero==3)
				continue;
			System.out.println(numero);
		}
	}
}