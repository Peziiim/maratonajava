package maratonajavadevdojo.classesabstratas.test;

import maratonajavadevdojo.classesabstratas.domain.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {


        Gerente gerente = new Gerente("Luffy", 7000);
        gerente.bonus();
        System.out.println(gerente);
    }

}
