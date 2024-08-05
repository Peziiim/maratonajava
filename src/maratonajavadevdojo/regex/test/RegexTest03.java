package maratonajavadevdojo.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest03 {
    public static void main(String[] args) {
        String regex = "0[xX]([\\da-fA-F])+( \\s|$)";
        String texto = "12 0x 0X 0xFFFFFABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("TEXTO: " + texto);
        System.out.println("indice: ");
        Character [] ch = new Character[texto.length()];

        int i = 0;
        for(Character parts : ch){
            ch [i] = texto.charAt(i);
            System.out.print(ch[i] + "  ");
            System.out.println(i);
            i++;
        }

        System.out.println("posições encontradas: ");
        while(matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group()+"\n");
        }
        int numeroHex = 0xDFA;
        System.out.println(numeroHex);
    }
}
