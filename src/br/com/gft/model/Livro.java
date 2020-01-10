package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto {
	protected String autor;
	protected String tema;
	protected int qntdPag;

	public Livro(String nome, Double preço, int qntd, String autor, String tema, int qntdPag) {
		super(nome, preço, qntd);
		this.autor = autor;
		this.tema = tema;
		this.qntdPag = qntdPag;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQntdPag() {
		return qntdPag;
	}

	public void setQntdPag(int qntdPag) {
		this.qntdPag = qntdPag;
	}

	@Override
	public Double calculaImposto() {
		double imp = 0;
		if (this.getTema() == "educativo") {
			System.out.println("Livro educativo não tem imposto :" + nome + ".");
		} else {
			imp = preço * 0.10;
		System.out.println("R$" + imp + "de imposto sobre o livro " + nome + ".");
		}
		return imp;
		
	}
		

}
