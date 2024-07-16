package maratonajavadevdojo.datas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];
        df[0] = DateFormat.getInstance();
        df[2] = DateFormat.getTimeInstance();
        df[3] = DateFormat.getDateTimeInstance();
        df[1] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for(DateFormat dft: df){
            System.out.println(dft.format(calendar.getTime()));
        }

    }
}
