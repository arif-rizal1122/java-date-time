package arifRizal.datetime;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {
    @Test
    void testLocalDate(){
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(1999, Month.APRIL, 10);
        LocalDate localDate2 = LocalDate.parse("1990-06-10");

        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);
    }

    @Test
    void testChangeLocalDate(){
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.withYear(2000);
        LocalDate localDate2 = localDate.withMonth(1).withYear(1999);

        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);

    }

    @Test
    void testManipulateLocalDate(){
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.plusYears(10);
        LocalDate localDate2 = localDate.plusMonths(10);
        LocalDate localDate3 = localDate.withMonth(1).withYear(1999);

        System.out.println(localDate);   // 2024-12-21
        System.out.println(localDate1);  // 2034-12-21
        System.out.println(localDate2);  // 2025-10-21
        System.out.println(localDate3);  // 1999-01-21

    }

    @Test
    void testGatDate(){
        LocalDate localDate = LocalDate.now();
        Month month = localDate.getMonth();
        int monthValue = localDate.getMonthValue();
        int dayOfMonth = localDate.getDayOfMonth();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int dayOfYears = localDate.getDayOfYear();

        System.out.println(localDate);
        System.out.println(month);
        System.out.println(monthValue);
        System.out.println(dayOfMonth);
        System.out.println(dayOfWeek);
        System.out.println(dayOfYears);

    }

}
