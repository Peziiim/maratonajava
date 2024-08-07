package maratonajavadevdojo.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest04 {
    public static void main(String[] args) {
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+\\.+([a-zA-Z]) ";
        String texto = "eduardo.oliveira@gmail.com, 12454edu@gmail.com, #@!wirsd@mail.com, teste@gmail.com";
        System.out.println("#@!wirsd@mail.com".matches(regex));

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("TEXTO: " + texto);
        System.out.println("indice: ");
        String [] ch = new String[4];

        int i = 0;
        for(String parts : ch){
            ch [i] = texto;
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
