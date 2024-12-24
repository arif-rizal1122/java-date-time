package arifRizal.datetime;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class LegacyDateTimeTest {

    @Test
    void testKonversiLegacyBaru(){
        Date date = new Date();
        Instant instantDate = date.toInstant();

        Calendar calendar = Calendar.getInstance();
        Instant instantCalender = calendar.toInstant();

        TimeZone timeZone = TimeZone.getDefault();
        ZoneId zoneId = timeZone.toZoneId();

        System.out.println(instantDate);
        System.out.println(instantCalender);
        System.out.println(zoneId);
    }

    @Test
    void testKonversiNewLegacy(){
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        Date date = Date.from(zonedDateTime.toInstant());

        Calendar calendar = GregorianCalendar.from(zonedDateTime);
        ZoneId zoneId = ZoneId.systemDefault();
        TimeZone timeZone = TimeZone.getTimeZone(zoneId);

        System.out.println(date);
        System.out.println(calendar);
        System.out.println(timeZone);
    }


}
