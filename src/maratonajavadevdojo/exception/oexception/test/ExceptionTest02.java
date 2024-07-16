package maratonajavadevdojo.exception.oexception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {

    private static void criarNovoArquivo() throws IOException {
        File file = new File("teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado? " + isCriado);

        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
