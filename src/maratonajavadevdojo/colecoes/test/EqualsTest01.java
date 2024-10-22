package maratonajavadevdojo.colecoes.test;

import maratonajavadevdojo.colecoes.domain.Celular;

public class EqualsTest01 {
    public static void main(String[] args) {
        Celular cel1 = new Celular("1A7F8D", "IPHONE");
        Celular cel2 = new Celular("1A7F8D", "IPHONE");

        System.out.println(cel2.equals(cel1));
    }
}
