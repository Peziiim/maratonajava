package maratonajavadevdojo.polimorfismo.test;

import maratonajavadevdojo.polimorfismo.repositorio.Repositorio;
import maratonajavadevdojo.polimorfismo.servico.RepositorioArquivo;
import maratonajavadevdojo.polimorfismo.servico.RepositorioBanco;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();

        repositorio.salvar();
    }
}
