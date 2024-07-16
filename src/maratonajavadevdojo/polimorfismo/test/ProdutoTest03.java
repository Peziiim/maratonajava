package maratonajavadevdojo.polimorfismo.test;

import maratonajavadevdojo.polimorfismo.domain.Computador;
import maratonajavadevdojo.polimorfismo.domain.Produto;
import maratonajavadevdojo.polimorfismo.domain.Tomate;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador(56000, "joao");

        Tomate tomate = new Tomate(2300, "Tomate");

    }
}
