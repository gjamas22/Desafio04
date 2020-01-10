package br.com.gft.model;

import java.util.List;

public class Loja {
	protected String nome;
	protected String cnpj;
	List<Livro> livros;
	List<VideoGame> videoGames;

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}

	public void listaLivros() {
		if (this.livros.size() == 0) {
			System.out.println("A loja não tem livros no estoque");
		} else {
			for (Livro index : livros) {
				System.out.println("Titulo:" + index.getNome() + " , preço: " + index.getPreço() + ", quantidade :"
						+ index.getQntd() + " em estoque.");
			}

		}
	}

	public void listaVideoGames() {
		if (this.videoGames.size() == 0) {
			System.out.println("A loja não tem video-games no seu estoque");
		} else {
			for (VideoGame index : videoGames) {
				System.out.println("Video game: " + index.getModelo() + " , preço : " + index.getPreço()
						+ " , quantidade " + index.getQntd() + " em estoque");

			}

		}

	}

	public Double calcularPatrimonio() {
		 Double result = 0.00;
		 for (Livro index : livros) {
			 result = result + (index.getPreço()*index.getQntd());
		}
		 for (VideoGame index : videoGames) {
			result = result + (index.getPreço()*index.getQntd());
		}
		 System.out.println("O patrimonio da loja: " + nome + " é de " + result);
		return result;

	}

}
