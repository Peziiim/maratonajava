package maratonajavadevdojo.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDirectory = new File("pasta");
        boolean isDirectory = fileDirectory.mkdir();
        System.out.println(isDirectory);

        File arquivoDiretorio = new File(fileDirectory,"texto2.txt");

        try {
            boolean isCreated = arquivoDiretorio.createNewFile();
            System.out.println(isCreated);

            File fileRenamed = new File(fileDirectory, "arquivoConfidencial.txt");
           boolean isRenamed = arquivoDiretorio.renameTo(fileRenamed);
            System.out.println(isRenamed);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
