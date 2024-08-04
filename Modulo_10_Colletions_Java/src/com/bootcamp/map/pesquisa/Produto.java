package com.bootcamp.map.pesquisa;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
	
	private long codigo;
	
	private String nome;
	
	private double preco;
	
	private int quantidade;

	public Produto(long codigo, String nome, double preco, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}

	@Override
	public int compareTo(Produto o) {
		return Double.compare(preco*quantidade, o.getPreco()*o.getQuantidade());
	}
}