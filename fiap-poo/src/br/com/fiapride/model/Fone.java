package br.com.fiapride.model;

public class Fone {

	public String cor;
	public String tamanho;
	public boolean estado;
	public boolean botaoEnergia;
	public boolean som;
	public boolean botaoSom;
	
	public Fone (String cor, String tamanho) {
		this.cor = cor;
		this.tamanho = tamanho;
		this.estado = false;
		this.botaoEnergia = false;
		this.som = false;
		this.botaoSom = false;
	}
	
	public void ligarDesligar (boolean botaoEnergia) {
		if (this.estado == false && botaoEnergia == true) {
			this.estado = true;
			this.botaoEnergia = false;
			System.out.println("O fone estava desligado. Agora está ligado.");
		} else if (this.estado == true && botaoEnergia == true) {
			this.estado = false;
			this.botaoEnergia = false;
			System.out.println("O fone estava ligado. Agora está desligado.");
		} else {
			System.out.println("Erro.");
		}
	}
	
	public void reproduzirSom (boolean botaoSom) {
		if (this.estado == true && botaoSom == true && this.som == false) {
			this.botaoSom = false;
			this.som = true;
			System.out.println("Reproduzindo som.");
		} else if (this.estado == true && botaoSom == true && this.som == true) {
			this.botaoSom = false;
			this.som = false;
			System.out.println("Interrompendo som.");
		} else {
			System.out.println("Erro.");
		}
	}
	
}
