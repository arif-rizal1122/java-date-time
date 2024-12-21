package arifRizal.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class LocalTimeTest {
    @Test
    void testLocalTime(){
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(10, 10, 10);
        LocalTime localTime2 = LocalTime.parse("10:20");

        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime2);
    }

    @Test
    void testChangeLocalTime() {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = localTime.withHour(10);
        LocalTime localTime2 = localTime.withHour(10).withMinute(20);

        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime2);
    }

    @Test
    void testManipulateLocalTime() {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = localTime.plusHours(10);
        LocalTime localTime2 = localTime.plusHours(10).plusMinutes(20);

        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime2);
    }


    @Test
    void testGetLocalTime() {
        LocalTime localTime = LocalTime.now();

        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();
        int nano = localTime.getNano();

        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println(nano);

    }

}
