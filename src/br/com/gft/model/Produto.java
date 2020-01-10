package br.com.gft.model;

public abstract class Produto {
	protected String nome;
	protected Double preço;
	protected int qntd;

	public Produto(String nome, Double preço, int qntd) {
		super();
		this.nome = nome;
		this.preço = preço;
		this.qntd = qntd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}

	public int getQntd() {
		return qntd;
	}

	public void setQntd(int qntd) {
		this.qntd = qntd;
	}

}