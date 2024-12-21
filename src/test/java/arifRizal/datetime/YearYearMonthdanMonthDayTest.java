package arifRizal.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class YearYearMonthdanMonthDayTest {
    @Test
    void testYearYearMonthdanMonthDay(){
        Year year = Year.now();
        Year year1 = Year.of(2000);
        Year year2 = Year.parse("2003");

        YearMonth yearMonth = YearMonth.now();
        YearMonth yearMonth1 = YearMonth.of(2001, Month.APRIL);
        YearMonth yearMonth2 = YearMonth.parse("2020-09");

        MonthDay monthDay = MonthDay.of(Month.APRIL, 20);
        MonthDay monthDay1 = MonthDay.now();
        MonthDay monthDay2 = MonthDay.parse("--10-06");

        System.out.println(year);
        System.out.println(year1);
        System.out.println(year2);
        System.out.println("=============");

        System.out.println(yearMonth);
        System.out.println(yearMonth1);
        System.out.println(yearMonth2);
        System.out.println("==================");

        System.out.println(monthDay);
        System.out.println(monthDay1);
        System.out.println(monthDay2);

    }

    @Test
    void testKonversiYearToLocalDate(){
        Year year = Year.of(1980);
        YearMonth yearMonth = year.atMonth(Month.APRIL);
        LocalDate localDate = YearMonth.now().atDay(30);
        MonthDay monthDay = MonthDay.from(localDate);

        System.out.println(year);
        System.out.println(yearMonth);
        System.out.println(monthDay);
    }

    @Test
    void testKonversiYearToLocalTime(){
        Year year = Year.of(1980);
        YearMonth yearMonth = year.atMonth(Month.APRIL);
        LocalDate localDate = yearMonth.atDay(30);
        MonthDay monthDay = MonthDay.from(localDate);

        System.out.println(year);
        System.out.println(yearMonth);
        System.out.println(localDate);
        System.out.println(monthDay);
    }



}
