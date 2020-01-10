package br.com.gft.model;

public abstract class Produto {
	protected String nome;
	protected Double pre�o;
	protected int qntd;

	public Produto(String nome, Double pre�o, int qntd) {
		super();
		this.nome = nome;
		this.pre�o = pre�o;
		this.qntd = qntd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPre�o() {
		return pre�o;
	}

	public void setPre�o(Double pre�o) {
		this.pre�o = pre�o;
	}

	public int getQntd() {
		return qntd;
	}

	public void setQntd(int qntd) {
		this.qntd = qntd;
	}

}