package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Fone;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("--- Sistema FiapRide ---");
        
        Fone fone1 = new Fone("x", "x");
        System.out.println("Cor do fone: " + fone1.getCor() + " | Tamanho: " + fone1.getTamanho() + " | Estado: " + fone1.getEstado());
        
        Fone fone2 = new Fone("branco", "médio");
        System.out.println("Cor do fone: " + fone2.getCor() + " | Tamanho: " + fone2.getTamanho() + " | Estado: " + fone2.getEstado());

    }
}