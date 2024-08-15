package maratonajavadevdojo.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/eduardo");
        Path file = Paths.get("arquivo.txt");

      Path resolve = dir.resolve(file);
        System.out.println(resolve);

        Path abs = Paths.get("/home/eduardo");
        Path rel = Paths.get("dev/arquivo.txt");

        System.out.println("1 " + abs.resolve(rel));
        System.out.println("2 " + abs.resolve(file));
        System.out.println("3 " + rel.resolve(abs));
        System.out.println("3 " + rel.resolve(file));

    }
}
