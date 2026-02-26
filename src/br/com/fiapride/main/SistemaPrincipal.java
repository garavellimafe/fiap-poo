package br.com.fiapride.main;

// Importamos a classe Tenis para que o sistema a reconheça
import br.com.fiapride.model.Tenis;

public class SistemaPrincipal {

    public static void main(String[] args) {
        Tenis tenis1 = new Tenis();
        tenis1.material = "tecido";
        tenis1.cor = "azul e preto";
        tenis1.tamanho = 40;
        
        Tenis tenis2 = new Tenis();
        tenis2.material = "borracha e tecido";
        tenis2.cor = "vermelho e branco";
        tenis2.tamanho = 37;
      

        // Exibindo os dados no Console
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("O tenis de " + tenis1.material + " de cores " + tenis1.cor + " do tamanho " + tenis1.tamanho);
        System.out.println("O tenis de " + tenis2.material + " de cores " + tenis2.cor + " do tamanho " + tenis2.tamanho);
        
        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
    }
}
