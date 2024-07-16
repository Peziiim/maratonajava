package maratonajavadevdojo.classesabstratas.domain;

public abstract class Pessoa {
    protected String nome;
    protected double salario;

    public Pessoa(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract void imprime();

}
