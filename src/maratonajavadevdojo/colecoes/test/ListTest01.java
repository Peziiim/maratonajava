package maratonajavadevdojo.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List <String> nomes = new ArrayList<>(); //1.4
        nomes.add("William");
        nomes.add("DevDojo Academy");

        for (String nome: nomes){
            System.out.println(nome);
        }
    }
}
