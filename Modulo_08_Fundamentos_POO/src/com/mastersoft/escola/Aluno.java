package com.mastersoft.escola;

//Exemplos de Getters e Setters
public class Aluno {
	
	//Padrão JavaBeans
	private String nome;
	
	private int idade;
	
	private String sexo;
	
	private String uf;
	
	public Aluno() {
		super();
	}

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
}
