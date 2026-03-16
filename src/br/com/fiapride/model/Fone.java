package br.com.fiapride.model;

public class Fone {

	private String cor;
	private String marca;
	private String estado;
	private boolean som;
	
	public Fone (String cor, String tamanho) {
		this.setCor(cor);
		this.marca = tamanho;
		this.estado = "desligado";
		this.som = false;
	}
	
	public void ligarDesligar (boolean botaoEnergia) {
		if (this.estado == "desligado" && botaoEnergia == true) {
			this.estado = "ligado";
			botaoEnergia = false;
			System.out.println("O fone estava desligado. Agora está ligado.");
		} else if (this.estado == "ligado" && botaoEnergia == true) {
			this.estado = "desligado";
			botaoEnergia = false;
			System.out.println("O fone estava ligado. Agora está desligado.");
		} else {
			System.out.println("Erro.");
		}
	}
	
	public void apertaBotaoSom (boolean botaoSom) {
		if (this.estado == "ligado" && botaoSom == true && this.som == false) {
			botaoSom = false;
			this.som = true;
		} else if (this.estado == "ligado" && botaoSom == true && this.som == true) {
			botaoSom = false;
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
	
	public String getCor() {
		return this.cor;
	}
	
	public void atualizarCor(String novaCor) {
		System.out.println("Personalizando fone de ouvido " + this.marca + "...");
		this.setCor(novaCor);
	}
	
	private void setCor(String novaCor) {
		if (novaCor != null && !novaCor.trim().isEmpty()) {
			this.cor = novaCor;
			System.out.println("Cor do fone de ouvido " + this.marca + " computada.");
		} else {
			System.out.println("A cor informada é inválida!");
		}
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getEstado() {
		return this.estado;
	}
}
