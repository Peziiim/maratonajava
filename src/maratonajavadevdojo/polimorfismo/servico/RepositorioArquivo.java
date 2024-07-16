package maratonajavadevdojo.polimorfismo.servico;

import maratonajavadevdojo.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando doideiras");
    }
}
