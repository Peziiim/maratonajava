package maratonajavadevdojo.datas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 45);
        System.out.println(time);
        System.out.println(LocalTime.now());
        System.out.println(time.getNano());
        System.out.println(LocalTime.MIN);
    }
}
