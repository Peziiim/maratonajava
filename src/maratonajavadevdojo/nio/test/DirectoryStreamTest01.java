package maratonajavadevdojo.nio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\eduar\\OneDrive\\OneDrive2\\OneDrive\\Documentos\\GitHub\\maratonajava");
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(path)){
            for(Path s: stream){
                System.out.println(s.getFileName());
            }
        } catch (IOException e){
            e.printStackTrace();

        }

    }
}
