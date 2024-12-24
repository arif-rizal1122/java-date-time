package arifRizal.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.*;
import java.util.ArrayList;
import java.util.List;

public class TemporalTest {
    @Test
    void testTemporal(){
        Temporal temporal = LocalTime.now();
        Temporal temporal1 = LocalDate.now();
        Temporal temporal2 = LocalDateTime.now();
        Temporal temporal3 = ZonedDateTime.now();
        Temporal temporal4 = Year.now();
        Temporal temporal5 = YearMonth.now();
        Temporal temporal6 = Instant.now();

        System.out.println(temporal);
        System.out.println(temporal1);
        System.out.println(temporal2);
        System.out.println(temporal3);
        System.out.println(temporal4);
        System.out.println(temporal5);
        System.out.println(temporal6);
    }

    @Test
    void testTemporalAmount(){
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.plus(Duration.ofHours(10));
        LocalDateTime localDateTime2 = localDateTime.minus(Period.of(0,10, 10));

        System.out.println(localDateTime);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }

    @Test
    void testTemporalUnit(){
        long between = ChronoUnit.SECONDS.between(LocalDateTime.now(), LocalDateTime.now().plusDays(10));
        long between1 = ChronoUnit.MINUTES.between(LocalDateTime.now(), LocalDateTime.now().plusDays(10));
        long between2 = ChronoUnit.DAYS.between(LocalDateTime.now(), LocalDateTime.now().plusDays(10));

        System.out.println(between);
        System.out.println(between1);
        System.out.println(between2);
    }


    @Test
    void testTemporalField(){
        Temporal temporal = LocalDateTime.now();

        System.out.println(temporal.get(ChronoField.YEAR));
        System.out.println(temporal.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(temporal.get(ChronoField.DAY_OF_MONTH));
        System.out.println(temporal.get(ChronoField.HOUR_OF_DAY));
        System.out.println(temporal.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(temporal.get(ChronoField.HOUR_OF_DAY));
        // dll
    }


    @Test
    void testTemporalQuery(){
        LocalDateTime localDateTime = LocalDateTime.now();
        List<Integer> integers = localDateTime.query(temporal -> {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(temporal.get(ChronoField.YEAR));
            list.add(temporal.get(ChronoField.MONTH_OF_YEAR));
            list.add(temporal.get(ChronoField.DAY_OF_MONTH));
            return list;
        });
        System.out.println(integers);
    }


    @Test
    void testTemporalAdjuster(){
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate localDate2 = localDate.with(TemporalAdjusters.lastDayOfMonth());
        LocalDate localDate3 = localDate.with(TemporalAdjusters.firstDayOfYear());
        LocalDate localDate4 = localDate.with(TemporalAdjusters.lastDayOfYear());

        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
        System.out.println(localDate4);
    }







}
