package maratonajavadevdojo.io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        FileTest01 fileT = new FileTest01();
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(fileT.fileTest, true));
            br.write("Dudu gato lindo gostoso");
            br.newLine();
            br.write("legal");
            br.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

