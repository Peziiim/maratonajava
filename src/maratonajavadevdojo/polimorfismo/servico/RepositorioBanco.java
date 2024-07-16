package maratonajavadevdojo.polimorfismo.servico;

import maratonajavadevdojo.polimorfismo.repositorio.Repositorio;

import java.sql.SQLOutput;

public class RepositorioBanco implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um banco de dados");
    }
}
