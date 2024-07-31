package maratonajavadevdojo.formatacao.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        String d = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String j = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String l = date.format(DateTimeFormatter.ISO_DATE);

        System.out.println(d);
        System.out.println(j);
        System.out.println(l);

        LocalDate parse1 = LocalDate.parse("20240731", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);

        DateTimeFormatter BR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBr = LocalDate.now().format(BR);
        System.out.println(formatBr);

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(dt);
        System.out.println(formatGR);
    }
}
