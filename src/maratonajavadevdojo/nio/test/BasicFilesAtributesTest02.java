package maratonajavadevdojo.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFilesAtributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/novo_path.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModified = basicFileAttributes.lastModifiedTime();
        FileTime lastAccesTime = basicFileAttributes.lastAccessTime();

        System.out.println("creationTime " + creationTime);
        System.out.println("lastModified " + lastModified);
        System.out.println("lastAccess " + lastAccesTime);

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModified, newCreationTime, creationTime);
        creationTime = basicFileAttributes.creationTime();
        lastModified = basicFileAttributes.lastModifiedTime();
        lastAccesTime = basicFileAttributes.lastAccessTime();

        System.out.println("----------------------------------------");

        System.out.println("creationTime " + creationTime);
        System.out.println("lastModified " + lastModified);
        System.out.println("lastAccess " + lastAccesTime);

    }
}
