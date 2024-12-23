package arifRizal.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class InstantTest {
    @Test
    void testInstant(){
        Instant instant = Instant.now();
        Instant instant1 = Instant.ofEpochMilli(System.currentTimeMillis());

        System.out.println(instant);
        System.out.println(instant1);
    }

    @Test
    void testChangeInstant() {
      Instant instant = Instant.now();
      Instant instant1 = instant.plusMillis(1000);
      Instant instant2 = instant.plusSeconds(1000);
      Instant instant3 = instant.minusMillis(1000);
      Instant instant4 = instant.minusSeconds(1000);

        System.out.println(instant);
        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println(instant3);
        System.out.println(instant4);
    }

    @Test
    void testGetInstant() {
        Instant instant = Instant.now();
        long epochMili = instant.toEpochMilli();
        long epochSecond = instant.getEpochSecond();
        int nano = instant.getNano();

        System.out.println(instant);
        System.out.println(epochMili);
        System.out.println(epochSecond);
        System.out.println(nano);
    }

    @Test
    void testKonversiDariInstant(){
        Instant instant = Instant.now();

        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.of("Asia/Makassar"));
        LocalTime localTime = LocalTime.ofInstant(instant, ZoneId.of("Asia/Makassar"));
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.of("Asia/Makassar"));
        System.out.println(instant);
        System.out.println(localDateTime);
        System.out.println(localTime);
        System.out.println(zonedDateTime);
    }

    @Test
    void testKonversiKeInstant() {
        Instant instant = LocalDateTime.now().toInstant(ZoneOffset.ofHours(2));
        Instant instant1 = ZonedDateTime.now().toInstant();

        System.out.println(instant);
        System.out.println(instant1);
    }


}
