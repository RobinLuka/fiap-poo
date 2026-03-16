package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Fone;

public class TesteFone {

    public static void main(String[] args) {

        System.out.println("--- Sistema FiapRide ---");
        
        Fone meuFone = new Fone("preto", "JBL");
        System.out.println("Cor do fone: " + meuFone.getCor() + " | Marca: " + meuFone.getMarca() + " | Estado: " + meuFone.getEstado());
        
        Fone outroFone = new Fone("branco", "Alguma");
        System.out.println("Cor do fone: " + outroFone.getCor() + " | Marca: " + outroFone.getMarca() + " | Estado: " + outroFone.getEstado());

        meuFone.ligarDesligar(true);
        meuFone.apertaBotaoSom(true);
        meuFone.apertaBotaoSom(true);
        meuFone.ligarDesligar(true);
        meuFone.apertaBotaoSom(true);
        
        meuFone.atualizarCor("Branco");
        System.out.println("Cor do fone: " + meuFone.getCor() + " | Marca: " + meuFone.getMarca() + " | Estado: " + meuFone.getEstado());
        
        //Fone foneRuim = new Fone();
    }
}