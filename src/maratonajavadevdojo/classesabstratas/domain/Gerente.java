package maratonajavadevdojo.classesabstratas.domain;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void imprime() {
        System.out.println(nome);
    }

    @Override
    public void bonus() {
        this.salario = salario + salario * 0.5;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
