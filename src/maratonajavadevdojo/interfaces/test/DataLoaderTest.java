package maratonajavadevdojo.interfaces.test;

import maratonajavadevdojo.interfaces.domain.DataBaseLoader;
import maratonajavadevdojo.interfaces.domain.DataLoader;
import maratonajavadevdojo.interfaces.domain.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        fileLoader.load();
        dataBaseLoader.load();

        fileLoader.remove();
        dataBaseLoader.remove();

        fileLoader.checkPermission();
        dataBaseLoader.checkPermission();

        DataBaseLoader.retrieveDataMaxSize();
        DataLoader.retrieveDataMaxSize();

    }
}
