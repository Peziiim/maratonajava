package maratonajavadevdojo.nio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



class ListAllFiles extends SimpleFileVisitor<Path> {
    private final Pattern pattern;

    public ListAllFiles(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        // Verifica se o nome do arquivo corresponde ao padrão ".java"
        Matcher matcher = pattern.matcher(file.getFileName().toString());
        if (matcher.matches()) {
            System.out.println(file.toString());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class  SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        // Define a expressão regular para arquivos .java
        String regex = "^(.*)\\.java$";
        Pattern pattern = Pattern.compile(regex);

        // Define o caminho raiz para começar a busca
        Path root = Paths.get(".");

        // Cria uma instância de ListJavaFiles com o padrão fornecido
        ListAllFiles fileVisitor = new ListAllFiles(pattern);

        // Caminha pela árvore de diretórios a partir do caminho raiz
        Files.walkFileTree(root, fileVisitor);
    }
}
