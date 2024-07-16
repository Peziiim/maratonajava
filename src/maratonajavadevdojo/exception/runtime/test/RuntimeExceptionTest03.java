package maratonajavadevdojo.exception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreCo();
    }

    private static String abreCo() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo os dados");
            return "Conexão aberta";

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            System.out.println("Fechando arquivo");
        }
        return null;
    }
}
