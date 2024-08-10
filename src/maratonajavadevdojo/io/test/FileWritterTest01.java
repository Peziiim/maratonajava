package maratonajavadevdojo.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterTest01 {
    public static void main(String[] args) {
        FileTest01 fileT = new FileTest01();
        try {
            FileWriter fileWriter = new FileWriter(fileT.fileTest, true);
            fileWriter.write("Dudu lindão\nSou jamaicano");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
