package br.com.bootcamp.parte_4.metodos.aula02;

public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV ligada ? " + smartTv.ligada);
		System.out.println("Canal Atual :" + smartTv.canal);
		System.out.println("Volume Atual :" + smartTv.volume);

		smartTv.ligar();
		System.out.println("TV ligada ? " + smartTv.ligada);
		
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		System.out.println("Volume Atual :" + smartTv.volume);
		
		smartTv.mudarCanal(13);
		System.out.println("Canal Atual :" + smartTv.canal);
		
	}
}
