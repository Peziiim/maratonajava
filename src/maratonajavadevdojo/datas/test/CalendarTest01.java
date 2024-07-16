package maratonajavadevdojo.datas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("A semana começa no domingo");
        }
        System.out.println("Dia do ano: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(date);
        System.out.println("Dia da semana: " + calendar.get(Calendar.DAY_OF_WEEK));
    }
}
