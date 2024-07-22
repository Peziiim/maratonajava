package maratonajavadevdojo.datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2022, Month.AUGUST, 6);
        LocalTime time = LocalTime.of(9, 45, 0);
        System.out.println(localDateTime);

        LocalDateTime ltd1 = date.atTime(time);
        System.out.println(ltd1);

    }
}
