package maratonajavadevdojo.formatacao.test;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        String pattern = "'São Paulo' dd 'de' MMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
    }
}
