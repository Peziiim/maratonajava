package maratonajavadevdojo.polimorfismo.domain;

public class Tomate extends Produto{
    private static final double IMPOSTO_POR_CENTO = 0.21;
    private String DataDeValidade;

    public Tomate(double valor, String nome) {
        super(valor, nome);
    }

    @Override
    public Double calcularImposto() {
        System.out.println("calculando imposto");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
