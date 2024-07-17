package maratonajavadevdojo.datas.test;

import maratonajavadevdojo.assossiacao.Local;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapão = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");
        Locale localeBrasil = new Locale("pt", "BR");

        Calendar calendar = Calendar.getInstance();

       DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
       DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
       DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
       DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapão);
       DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);
       DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);

       System.out.println("Italia: " + df.format(calendar.getTime()));
       System.out.println("Suiça: " + df2.format(calendar.getTime()));
        System.out.println("India: " + df3.format(calendar.getTime()));
        System.out.println("Japão: " + df4.format(calendar.getTime()));
        System.out.println("Holanda: " + df5.format(calendar.getTime()));
        System.out.println("Brasil: " + df6.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeIndia));
        System.out.println(localeCH.getDisplayCountry(localeJapão));
        System.out.println(localeBrasil.getDisplayCountry(localeHolanda));
    }
}
