package arifRizal.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class ZonedDateTimes {
    @Test
    void testZonedDateTime(){

        java.time.ZonedDateTime zonedDateTime = java.time.ZonedDateTime.now();
        java.time.ZonedDateTime zonedDateTime1 = java.time.ZonedDateTime.now(ZoneId.of("GMT"));
        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.of(LocalDateTime.now(), ZoneOffset.ofHours(7));
        java.time.ZonedDateTime zonedDateTime3 = java.time.ZonedDateTime.now(ZoneOffset.ofHours(8));

        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);

    }


    @Test
    void testParseZonedDateTime() {
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2023-10-09T08:07:06+07:00[Asia/Makassar]");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("2020-10-09T08:07:06+07:00");

        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);
    }


    @Test
    void testChageZonedDateTime(){
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime zonedDateTime1 = zonedDateTime.withZoneSameInstant(ZoneId.of("GMT"));
        ZonedDateTime zonedDateTime2 = zonedDateTime.withZoneSameLocal(ZoneId.of("GNT"));

        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
    }

}
