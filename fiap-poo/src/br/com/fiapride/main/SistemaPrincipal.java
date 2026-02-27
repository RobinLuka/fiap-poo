package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Fone;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("--- Sistema FiapRide ---");
        
        Fone meuFone = new Fone("preto", "pequeno");
        System.out.println("Cor do fone: " + meuFone.cor + " | Tamanho: " + meuFone.tamanho + " | Estado: " + meuFone.estado);
        
        Fone outroFone = new Fone("branco", "médio");
        System.out.println("Cor do fone: " + outroFone.cor + " | Tamanho: " + outroFone.tamanho + " | Estado: " + outroFone.estado);

        meuFone.ligarDesligar(true);
        meuFone.reproduzirSom(true);
        meuFone.reproduzirSom(true);
        meuFone.ligarDesligar(true);
        meuFone.reproduzirSom(true);
    }
}