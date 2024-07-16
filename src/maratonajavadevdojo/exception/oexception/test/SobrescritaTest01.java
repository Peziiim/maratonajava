package maratonajavadevdojo.exception.oexception.test;

import maratonajavadevdojo.exception.domain.Funcionario;
import maratonajavadevdojo.exception.domain.Pessoa;
import maratonajavadevdojo.exception.oexception.domain.LoginInvalidoException;

public class SobrescritaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
