package maratonajavadevdojo.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAtributtesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("home/eduardo/dev/file.txt");
        PosixFileAttributes posix = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posix.permissions());
        PosixFileAttributeView posixFile = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rw-rw-rw-");
        posixFile.setPermissions(posixFilePermissions);


    }
}
