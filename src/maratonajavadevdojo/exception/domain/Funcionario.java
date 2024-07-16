package maratonajavadevdojo.exception.domain;

import maratonajavadevdojo.exception.oexception.domain.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{

    public void salvar() throws LoginInvalidoException{
        System.out.println("salvando funcionário");
    }
}
