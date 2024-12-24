package arifRizal.datetime;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

public class DayOfWeekTest {
    @Test
    void testDayOfWeek(){
        DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;
        DayOfWeek dayOfWeek1 = dayOfWeek.plus(2);
        DayOfWeek dayOfWeek2 = dayOfWeek.minus(1);

        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek1);
        System.out.println(dayOfWeek2);
    }

}
