package maratonajavadevdojo.io.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
    FileTest01 file = new FileTest01();

        try(
             FileReader fr = new FileReader(file.fileTest)){
            BufferedReader br = new BufferedReader(new FileReader(file.fileTest));

            String linha;
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
            br.close();
    }
        catch(
    IOException e){
        throw new RuntimeException();
      }
    }
}
