package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Fone;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Fone meuFone = new Fone();
        meuFone.cor = "preto";
        meuFone.tamanho = "pequeno";
        meuFone.estado = "novo";
        
        // Criando o segundo passageiro (Objeto 2)
        Fone outroFone = new Fone();
        outroFone.cor = "branco";
        outroFone.tamanho = "médio";
        outroFone.estado = "antigo";

        // Exibindo os dados no Console
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Cor do fone: " + meuFone.cor + " | Tamanho: " + meuFone.tamanho + " | Estado: " + meuFone.estado);
        System.out.println("Cor do fone: " + outroFone.cor + " | Tamanho: " + outroFone.tamanho + " | Estado: " + outroFone.estado);

        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
    }
}