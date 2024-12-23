package arifRizal.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class ClockTest {
    @Test
    void testCLock(){
        Clock clockUTC = Clock.systemUTC();
        Clock clockSystem = Clock.systemDefaultZone();
        Clock clockJakarta = Clock.system(ZoneId.of("Asia/Makassar"));

        System.out.println(clockUTC);
        System.out.println(clockSystem);
        System.out.println(clockJakarta);
    }

    @Test
    void testGetInstantCLock() throws Throwable {
        Clock clockMksr = Clock.system(ZoneId.of("Asia/Makassar"));

        Instant instant = clockMksr.instant();
        System.out.println(instant);
        Thread.sleep(1_00);
        Instant instant1 = clockMksr.instant();
        System.out.println(instant1);

    }

    @Test
    void testMakeDataFromCLock(){
        Clock clockMksr = Clock.system(ZoneId.of("Asia/Makassar"));
        Year year = Year.now(clockMksr);
        YearMonth yearMonth = YearMonth.now(clockMksr);
        LocalTime localTime = LocalTime.now(clockMksr);
        LocalDate localDate = LocalDate.now(clockMksr);

        LocalDateTime localDateTime = LocalDateTime.now(clockMksr);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(clockMksr);

        System.out.println(clockMksr);
        System.out.println(year);
        System.out.println(yearMonth);
        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(zonedDateTime);

    }




}
