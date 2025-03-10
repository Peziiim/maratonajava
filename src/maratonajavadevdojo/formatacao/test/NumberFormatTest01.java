package maratonajavadevdojo.formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale lc = Locale.getDefault();
        Locale [] locale = new Locale[4];
        locale[0] = Locale.JAPAN;
        locale[1] = Locale.ITALY;
        locale[2] = Locale.CHINA;
        locale[3] = Locale.getDefault();

        NumberFormat [] numberFormat = new NumberFormat[4];
        numberFormat[0] = NumberFormat.getNumberInstance(locale[2]);
        numberFormat[1] = NumberFormat.getNumberInstance(locale[3]);
        numberFormat[2] = NumberFormat.getNumberInstance(locale[1]);
        numberFormat[3] = NumberFormat.getNumberInstance(locale[0]);

        double valor = 10_000.2130;

        for(NumberFormat number: numberFormat){
            System.out.println(number.format(valor));
        }
    }
}
