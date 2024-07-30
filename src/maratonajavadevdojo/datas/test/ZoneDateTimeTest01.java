package maratonajavadevdojo.datas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneDateTimeTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime tokyoDateTime = now.atZone(tokyoZone);
        System.out.println(tokyoDateTime);

        Instant nowInstant = Instant.now();
        ZonedDateTime instantTokyo = nowInstant.atZone(tokyoZone);
        System.out.println(instantTokyo);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset zoneOffset = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(zoneOffset);
        System.out.println(offsetDateTime);

        JapaneseDate from = JapaneseDate.from(LocalDate.now());
        System.out.println(from);
    }
}
