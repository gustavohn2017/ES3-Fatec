package br.com.fatec;


// Classe criada para molde do objeto produto

public class Produto {
	private String nome;
	private double valProd;

	public Produto(String nome, double valProd) {
		super();
		this.nome = nome;
		this.valProd = valProd;
	}

	public String getNome() {
		return nome;
	}

	public double getValProd() {
		return valProd;
	}

	
	
	
}


