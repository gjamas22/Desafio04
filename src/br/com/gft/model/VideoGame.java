package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {
	protected String marca;
	protected String modelo;
	protected Boolean isUsado;

	public VideoGame(String nome, Double preço, int qntd, String marca, String modelo, Boolean isUsado) {
		super(nome, preço, qntd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Boolean getIsUsado() {
		return isUsado;
	}

	public void setIsUsado(Boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public Double calculaImposto() {
		double imp = 0;
		if (this.getIsUsado() == true) {
			imp = preço * 0.25;
			System.out.println("Imposto " + nome + " , " + imp + ".");
		} else {
			imp = preço * 0.45;
		System.out.println("Imposto " + nome + " ," + imp + " .");
		}
		return 0.0;
	}

}
