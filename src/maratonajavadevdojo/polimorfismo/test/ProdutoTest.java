package maratonajavadevdojo.polimorfismo.test;

import maratonajavadevdojo.polimorfismo.domain.Computador;
import maratonajavadevdojo.polimorfismo.domain.Tomate;
import maratonajavadevdojo.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador( 2500, "I7-15IU");
        Tomate tomate = new Tomate(15, "Tomate baiano");

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
