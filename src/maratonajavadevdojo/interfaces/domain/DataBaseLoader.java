package maratonajavadevdojo.interfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    public static void retrieveDataMaxSize(){
        System.out.println("Dentro do banco de dados");
    }
}
