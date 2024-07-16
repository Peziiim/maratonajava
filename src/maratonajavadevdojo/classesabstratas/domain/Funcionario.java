package maratonajavadevdojo.classesabstratas.domain;

public abstract class  Funcionario extends Pessoa{

    public Funcionario(String nome, double salario) {
        super(nome, salario);
    }

    public abstract void bonus();

}

