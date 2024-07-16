package maratonajavadevdojo.interfaces.domain;

public interface DataLoader {
    void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissoões");
    }

    public static void retrieveDataMaxSize(){
        System.out.println("Dentro da interface");
    }
}
