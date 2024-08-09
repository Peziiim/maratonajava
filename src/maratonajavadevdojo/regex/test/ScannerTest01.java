package maratonajavadevdojo.regex.test;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {



       String texto = "Levi, Eren, Eduardo, jõao, mikasa, 200, true, 56 ";
       String [] nomes = texto.split(",");

        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while(scanner.hasNext()){

          if(scanner.hasNextInt()){
              int i = scanner.nextInt();
              System.out.println(i);
          }

          if(scanner.hasNextBoolean()){
              boolean i = scanner.nextBoolean();
              System.out.println(i);
          }
            System.out.println(scanner.next());
        }

    }
}
