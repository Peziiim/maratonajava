package maratonajavadevdojo.datas.test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, Month.JANUARY, 25);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date);
    }
}
