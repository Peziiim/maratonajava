package maratonajavadevdojo.exception.oexception.test;

import maratonajavadevdojo.exception.oexception.domain.Leitor1;
import maratonajavadevdojo.exception.oexception.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo2();
    }

    public static void lerArquivo2() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {

        }
    }

    public static void lerArquivo() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
