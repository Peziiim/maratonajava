package maratonajavadevdojo.io.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
public File fileTest = new File ("C:\\Users\\eduar\\OneDrive\\OneDrive2\\OneDrive\\Documentos\\GitHub\\maratonajava\\.idea\\file.txt");

    public static void main(String[] args)  {
        File file = new File
                ("C:\\Users\\eduar\\OneDrive\\OneDrive2\\OneDrive\\Documentos\\GitHub\\maratonajava\\.idea\\file.txt");
        try {
           boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.isDirectory());

            System.out.println(new Date(file.lastModified()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
