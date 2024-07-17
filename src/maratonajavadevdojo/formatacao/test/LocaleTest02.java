package maratonajavadevdojo.formatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        for(String isoLang: isoLanguages){
            System.out.println(isoLang+ " ");
        }

        for(String isoCoun: isoCountries){
            System.out.println(isoCoun+ " ");
        }
    }
}
