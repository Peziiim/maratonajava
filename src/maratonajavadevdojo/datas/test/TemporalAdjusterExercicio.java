package maratonajavadevdojo.datas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.*;
import java.util.Calendar;

class GetnextWorkDay implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch (dayOfWeek){
            case THURSDAY: addDays = 4;
            case FRIDAY: addDays = 3; break;
            case SATURDAY: addDays = 2; break;
            default: addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterExercicio {
    public static void main(String[] args) {
        // Objetivo: retornar proximo dia útil (SEGUNDA-QUINTA)

        LocalDate now = LocalDate.now().plusDays(4);
        System.out.println(now.getDayOfWeek());

        now = now.with(new GetnextWorkDay());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }

}
