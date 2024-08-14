package maratonajavadevdojo.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizerTest01 {
    public static void main(String[] args) {
        String directoryProject = "home/eduardo/dev";
        String arquvtext = "../../arquivo.txt";
       Path path1 = Paths.get(directoryProject, arquvtext);
        System.out.println(path1);
        System.out.println(path1.normalize());
        Path path2 = Paths.get("home/./eduardo/./dev");
        System.out.println(path2.normalize());
    }
}
