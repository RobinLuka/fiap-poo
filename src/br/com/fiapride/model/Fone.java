package br.com.fiapride.model;

public class Fone {

	private String cor;
	private String tamanho;
	private String estado;
	private boolean botaoEnergia;
	private boolean som;
	private boolean botaoSom;
	
	public Fone (String cor, String tamanho) {
		this.setCor(cor);
		this.setTamanho(tamanho);
		this.estado = "desligado";
		this.botaoEnergia = false;
		this.som = false;
		this.botaoSom = false;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	private void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getTamanho() {
		return this.tamanho;
	}
	
	private void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public void ligarDesligar (boolean botaoEnergia) {
		if (this.estado == "desligado" && botaoEnergia == true) {
			this.estado = "ligado";
			this.botaoEnergia = false;
			System.out.println("O fone estava desligado. Agora está ligado.");
		} else if (this.estado == "ligado" && botaoEnergia == true) {
			this.estado = "desligado";
			this.botaoEnergia = false;
			System.out.println("O fone estava ligado. Agora está desligado.");
		} else {
			System.out.println("Erro.");
		}
	}
	
	public void apertaBotaoSom (boolean botaoSom) {
		if (this.estado == "ligado" && botaoSom == true && this.som == false) {
			this.botaoSom = false;
			this.som = true;
		} else if (this.estado == "ligado" && botaoSom == true && this.som == true) {
			this.botaoSom = false;
			this.som = false;
		} else {
			System.out.println("Erro.");
		}
		reproduzirSom();
	}
	
	private void reproduzirSom () {
		if (this.som == true) {
			System.out.println("Reproduzindo som.");
		} else {
			System.out.println("Som desativado.");
		}
	}
	
}
