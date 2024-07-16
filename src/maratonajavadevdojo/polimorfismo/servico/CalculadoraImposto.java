package maratonajavadevdojo.polimorfismo.servico;

import maratonajavadevdojo.polimorfismo.domain.Computador;
import maratonajavadevdojo.polimorfismo.domain.Produto;
import maratonajavadevdojo.polimorfismo.domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório");
        double imposto = produto.calcularImposto();
        System.out.println(produto.getNome() + " " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
