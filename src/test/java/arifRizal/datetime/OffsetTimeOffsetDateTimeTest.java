package arifRizal.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class OffsetTimeOffsetDateTimeTest {
    @Test
    void testOffsetTimeOffsetDateTime(){

        OffsetTime offsetTime = OffsetTime.now();
        OffsetTime offsetTime1 = OffsetTime.of(LocalTime.now(), ZoneOffset.ofHours(4));
        OffsetTime offsetTime2 = OffsetTime.parse("09:09:09.500+09:00");

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.ofHours(4));


        System.out.println(offsetTime2);
        System.out.println(offsetTime);
        System.out.println(offsetTime1);
        System.out.println("=============================");
        System.out.println(offsetDateTime);
        System.out.println(offsetDateTime1);

    }

    @Test
    void testKonversiNonOffset(){
        LocalTime localTime = LocalTime.now();
        OffsetTime offsetTime = localTime.atOffset(ZoneOffset.ofHours(7));
        LocalTime localTime1 = offsetTime.toLocalTime();

        LocalDateTime localDateTime = LocalDateTime.now();
        OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(7));
        LocalDateTime localDateTime1 = offsetDateTime.toLocalDateTime();
        LocalDate localDate = offsetDateTime.toLocalDate();
        LocalTime localTime2 = offsetDateTime.toLocalTime();

        System.out.println(localTime);
        System.out.println(offsetTime);
        System.out.println(localTime1);

        System.out.println(localDateTime);
        System.out.println(offsetDateTime);
        System.out.println(localDateTime1);
        System.out.println(localDate);
        System.out.println(localTime1);
        System.out.println(localTime2);
    }












}
