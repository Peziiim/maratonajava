package maratonajavadevdojo.polimorfismo.domain;

public class Computador extends Produto{
    private static final double IMPOSTO_POR_CENTO = 0.51;

    public Computador(double valor, String nome) {
        super(valor, nome);
    }

    @Override
    public Double calcularImposto() {
        System.out.println("calculando imposto");
        return this.valor * IMPOSTO_POR_CENTO;
    }

}
