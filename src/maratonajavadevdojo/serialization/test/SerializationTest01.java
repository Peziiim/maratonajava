package maratonajavadevdojo.serialization.test;

import maratonajavadevdojo.serialization.domain.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static Aluno aluno = new Aluno(1L, "Eduardo Oliveira", "1233343");
    public static void main(String[] args) {
        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void deserializar() {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectInputStream oos = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) oos.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
