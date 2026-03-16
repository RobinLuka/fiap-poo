package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Fone;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("--- Sistema FiapRide ---");
        
        Fone fone1 = new Fone("x", "x");
        System.out.println("Cor do fone: " + fone1.getCor() + " | Marca: " + fone1.getMarca() + " | Estado: " + fone1.getEstado());
        
        Fone fone2 = new Fone("branco", "JBL");
        System.out.println("Cor do fone: " + fone2.getCor() + " | Marca: " + fone2.getMarca() + " | Estado: " + fone2.getEstado());

    }
}