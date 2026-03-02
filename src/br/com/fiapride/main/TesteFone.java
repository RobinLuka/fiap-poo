package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Fone;

public class TesteFone {

    public static void main(String[] args) {

        System.out.println("--- Sistema FiapRide ---");
        
        Fone meuFone = new Fone("preto", "pequeno");
        System.out.println("Cor do fone: " + meuFone.getCor() + " | Tamanho: " + meuFone.getTamanho() + " | Estado: " + meuFone.getEstado());
        
        Fone outroFone = new Fone("branco", "médio");
        System.out.println("Cor do fone: " + outroFone.getCor() + " | Tamanho: " + outroFone.getTamanho() + " | Estado: " + outroFone.getEstado());

        meuFone.ligarDesligar(true);
        meuFone.apertaBotaoSom(true);
        meuFone.apertaBotaoSom(true);
        meuFone.ligarDesligar(true);
        meuFone.apertaBotaoSom(true);
    }
}