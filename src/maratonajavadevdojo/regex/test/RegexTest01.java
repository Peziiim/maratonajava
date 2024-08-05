package maratonajavadevdojo.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest01 {
    public static void main(String[] args) {
        String regex = "\\W";
        String texto = "textoabvccab";
        String texto2 = "aj@#$%¨@*isdh76q 348ukldbf9329-03";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("TEXTO: " + texto2);
        System.out.println("indice: ");
        Character [] ch = new Character[texto2.length()];

        int i = 0;
        for(Character parts : ch){
            ch [i] = texto2.charAt(i);
            System.out.print(ch[i] + "  ");
            System.out.println(i);
            i++;
        }

        System.out.println("posições encontradas: ");
        while(matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group()+"\n");
        }
    }
}
