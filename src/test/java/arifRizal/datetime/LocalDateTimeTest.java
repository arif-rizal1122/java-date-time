package arifRizal.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class LocalDateTimeTest {
   @Test
   void testLocalDateTime(){
       LocalDateTime localDateTime = LocalDateTime.now();
       LocalDateTime localDateTime1 = LocalDateTime.of(2020, Month.APRIL, 10, 20, 30);
       LocalDateTime localDateTime2 =  LocalDateTime.parse("2023-12-10T11:12:13.14444");

       System.out.println(localDateTime);   // 2024-12-21T22:35:00.968326149
       System.out.println(localDateTime1);  // 2020-04-10T20:30
       System.out.println(localDateTime2);  // 2023-12-10T11:12:13.144440
   }


    @Test
    void testChangeLocalDateTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.withYear(2002);
        LocalDateTime localDateTime2 = localDateTime.withMinute(30);

        System.out.println(localDateTime);   // 2024-12-21T22:38:26.864381957
        System.out.println(localDateTime1);  // 2002-12-21T22:38:26.864381957
        System.out.println(localDateTime2);  // 2024-12-21T22:30:26.864381957
    }


    @Test
    void testModifyLocalDateTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.plusYears(1).withMinute(10);
        LocalDateTime localDateTime2 = localDateTime.plusMinutes(30);


        System.out.println(localDateTime);   //  2024-12-21T22:41:01.954378310
        System.out.println(localDateTime1);  //  2025-12-21T22:10:01.954378310
        System.out.println(localDateTime2);  //  2024-12-21T23:11:01.954378310
    }

    @Test
    void testGetLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();

        Month month = localDateTime.getMonth();
        int monthValue = localDateTime.getMonthValue();
        int dayOfMonth = localDateTime.getDayOfMonth();
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        int dayOfYears = localDateTime.getDayOfYear();

        System.out.println(localDateTime);
        System.out.println(month);
        System.out.println(monthValue);
        System.out.println(dayOfMonth);
        System.out.println(dayOfWeek);
        System.out.println(dayOfYears);
    }

    @Test
    void testKonversiToLocalDate() {
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDate localDate = localDateTime.toLocalDate();
        LocalDateTime localDateTime1 = localDate.atTime(LocalTime.now());

        System.out.println(localDateTime1);
    }

    @Test
    void testKonversiToLocalTime() {
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalTime localTime = localDateTime.toLocalTime();
        LocalDateTime localDateTime1 = localTime.atDate(LocalDate.now());
        System.out.println(localDateTime1);
    }

}
