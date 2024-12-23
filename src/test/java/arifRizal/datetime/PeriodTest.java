package arifRizal.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    @Test
    void testPeriod(){
        Period period = Period.ofDays(10);
        Period period1 = Period.ofWeeks(10);
        Period period2 = Period.ofMonths(10);
        Period period3 = Period.ofYears(10);
        Period period4 = Period.of(10, 10, 10);

        System.out.println(period);
        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
    }

    @Test
    void testGetPeriod(){
        Period period = Period.of(10, 10, 10);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println(period);
        System.out.println(years);
        System.out.println(months);
        System.out.println(days);
    }



    @Test
    void testCountPeriod(){
          Period period = Period.between(
                  LocalDate.of(2020, 12, 23),
                  LocalDate.of(2021, 12, 6)
          );

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }

}






















