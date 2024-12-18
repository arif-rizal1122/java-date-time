package arifRizal.datetime;

import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneTest {
    @Test
    void testTimeZone(){
        TimeZone timeZone = TimeZone.getDefault();
        TimeZone timeZone1 = TimeZone.getTimeZone("Asia/Jakarta");
        String[] avalaiblleIDs = TimeZone.getAvailableIDs();


        System.out.println(timeZone);
        System.out.println(timeZone1);

        System.out.println(Arrays.asList(avalaiblleIDs));
    }

    @Test
    void testTimezoneDate() {
        // Dapatkan waktu lokal saat ini
        LocalDateTime localDateTime = LocalDateTime.now();

        // Format waktu lokal
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String localTime = localDateTime.format(formatter);
        System.out.println("Local time: " + localTime);

        // Dapatkan waktu GMT
        ZonedDateTime gmtDateTime = localDateTime.atZone(ZoneId.systemDefault()).withZoneSameInstant(ZoneId.of("GMT"));
        String gmtTime = gmtDateTime.format(formatter);
        System.out.println("GMT time: " + gmtTime);
    }

    @Test
    void testTimezoneCalender(){
        // Dapatkan waktu lokal saat ini
        Calendar localCalendar = Calendar.getInstance();
        SimpleDateFormat localFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String localTime = localFormatter.format(localCalendar.getTime());
        System.out.println("Local time: " + localTime);

        // Dapatkan waktu GMT
        Calendar gmtCalendar = (Calendar) localCalendar.clone();
        gmtCalendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        SimpleDateFormat gmtFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        gmtFormatter.setTimeZone(TimeZone.getTimeZone("GMT"));
        String gmtTime = gmtFormatter.format(gmtCalendar.getTime());
        System.out.println("GMT time: " + gmtTime);
    }
}
