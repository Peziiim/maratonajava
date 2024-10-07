package maratonajavadevdojo.nio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path arquivosparazip = Paths.get("pasta/arquivo.zip");
        Path arquivosparazipar = Paths.get("pasta/subpasta");
        zip(arquivosparazip, arquivosparazipar);

    }
    private static void zip(Path arquivoZip, Path arquivosParaZipar){
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip))) {
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar);
            for(Path file : directoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
            System.out.println("arquivo criado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
