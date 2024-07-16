package maratonajavadevdojo.polimorfismo.test;

import maratonajavadevdojo.polimorfismo.domain.Computador;
import maratonajavadevdojo.polimorfismo.domain.Produto;
import maratonajavadevdojo.polimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador(90000, "meu");
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("---------------------------");

        Produto produto2 = new Tomate(20, "americano");
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

    }
}
