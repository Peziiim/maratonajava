package maratonajavadevdojo.formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormaTest02 {
    public static void main(String[] args) {
        Locale lc = Locale.getDefault();
        Locale [] locale = new Locale[4];
        locale[0] = Locale.JAPAN;
        locale[1] = Locale.ITALY;
        locale[2] = Locale.CHINA;
        locale[3] = Locale.getDefault();

        NumberFormat [] numberFormat = new NumberFormat[4];
        numberFormat[0] = NumberFormat.getCurrencyInstance(locale[0]);
        numberFormat[1] = NumberFormat.getCurrencyInstance(locale[1]);
        numberFormat[2] = NumberFormat.getCurrencyInstance(locale[2]);
        numberFormat[3] = NumberFormat.getCurrencyInstance(locale[3]);

        double valor = 10_000.2130;

        for (int i = 0; i < numberFormat.length; i++) {
            System.out.println(locale[i].getDisplayCountry() + ": " + numberFormat[i].format(valor));

        }
    }
}
