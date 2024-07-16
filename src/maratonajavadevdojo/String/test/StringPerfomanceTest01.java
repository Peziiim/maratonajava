package maratonajavadevdojo.String.test;

public class StringPerfomanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100000);
        long fim = System.currentTimeMillis();
        System.out.println("tempo: " + (fim - inicio) + "ms");


        long inicio1 = System.currentTimeMillis();
        concatStringBuffer(100000);
        long fim1 = System.currentTimeMillis();
        System.out.println("tempo do Buffer: " + (fim1 - inicio1) + "ms");




    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }
        private static void concatStringBuffer(int size){
            StringBuilder sb = new StringBuilder(size);
            for (int i = 0; i < size; i++) {
                sb.append(i);
            }
        }
    }



