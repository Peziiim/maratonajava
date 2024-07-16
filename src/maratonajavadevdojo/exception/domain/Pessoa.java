package maratonajavadevdojo.exception.domain;

import maratonajavadevdojo.exception.oexception.domain.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Pessoa {

    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando pessoa");
    }
}
