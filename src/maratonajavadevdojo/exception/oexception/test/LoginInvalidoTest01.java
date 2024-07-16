package maratonajavadevdojo.exception.oexception.test;

import maratonajavadevdojo.exception.oexception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

        private static void logar() throws LoginInvalidoException{
            Scanner teclado = new Scanner(System.in);
            String usernameDB = "Goku";
            String senha = "Super sayajin";
            System.out.println("Usuário");
            String usernameDigitado = teclado.nextLine();
            System.out.println("Senha");
            String senhaDigitada = teclado.nextLine();
            if (!usernameDB.equals(usernameDigitado) || !senha.equals(senhaDigitada)) {
                throw new LoginInvalidoException("Usuário ou senha inválido");
            }
            System.out.println("Usuário logado com sucesso");
        }
    }


