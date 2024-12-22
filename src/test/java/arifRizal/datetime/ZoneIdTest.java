package arifRizal.datetime;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

public class ZoneIdTest {
    @Test
    void testZoneId(){

        ZoneId zoneId = ZoneId.systemDefault();
        ZoneId zoneIdGMT = ZoneId.of("GMT");

        Set<String> avalaibleZoneIds = ZoneId.getAvailableZoneIds();

        System.out.println(zoneId);
        System.out.println(zoneIdGMT);
        System.out.println(avalaibleZoneIds);
        avalaibleZoneIds.forEach(id -> System.out.println(id));

    }

    @Test
    void testZoneOffset(){
        ZoneOffset zoneOffset = ZoneOffset.of("+07:00");
        ZoneOffset zoneOffset1 = ZoneOffset.ofHours(-7);
        ZoneOffset zoneOffset2 = ZoneOffset.ofHoursMinutes(5, 9);

        System.out.println(zoneOffset);
        System.out.println(zoneOffset1);
        System.out.println(zoneOffset2);

    }

}
