package maratonajavadevdojo.io.test;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        FileTest01 file = new FileTest01();

        try(FileReader fr = new FileReader(file.fileTest)){
         //  char [] in = new char[30];
       /*    int size = fr.read(in);
            for(char n: in){
                System.out.print(n); */
            int i;
            while((i = fr.read()) != -1){
                System.out.print((char) i);
            }
        }
        catch(IOException e){
            throw new RuntimeException();
        }
     }
}
