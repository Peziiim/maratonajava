package maratonajavadevdojo.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizerTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("/home/eduardo");
        Path sla = Paths.get("/home/eduardo/devdojo/OlaMundo.java");
        Path pathToClass = path.relativize(sla);
        System.out.println(pathToClass);

        Path abs = Paths.get("/home/eduardo");
        Path abs2 = Paths.get("/usr/local");
        Path abs3 = Paths.get("/home/eduardo/devdojo/OlaMundo.java");

        Path rel = Paths.get("/temp");
        Path rel2 = Paths.get("/temp/temp.573894798");

        System.out.println("1 " +abs.relativize(abs3));
        System.out.println("2 " +abs3.relativize(abs));
        System.out.println("3 " +abs.relativize(abs2));
        System.out.println("4 " +rel.relativize(rel2));
        System.out.println("5 " +abs.relativize(rel2));

    }
}
