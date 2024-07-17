package maratonajavadevdojo.formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeJap = Locale.JAPAN;
        Locale localeItaly = Locale.ITALY;
        NumberFormat [] numberFormat = new NumberFormat[4];
        numberFormat[0] = NumberFormat.getInstance(Locale.CHINA);
        numberFormat[1] = NumberFormat.getInstance(localePT);
        numberFormat[2] = NumberFormat.getInstance(localeItaly);
        numberFormat[3] = NumberFormat.getInstance(localeJap);
        double valor = 10_000.2130;

        for(NumberFormat currency: numberFormat){
            System.out.println(currency.format(valor));
        }
    }
}
