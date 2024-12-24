package arifRizal.datetime;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParsingFormattingTest {
    @Test
    void testParsing(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate localDate = LocalDate.parse("2020 10 12", formatter);
        System.out.println(formatter);
        System.out.println(localDate);
    }

    @Test
    void testFormatting(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate localDate = LocalDate.now();
        String localDate1 = localDate.format(formatter);
        System.out.println(formatter);
        System.out.println(localDate);
        System.out.println(localDate1);
    }

    @Test
    void testDefaultFormatter(){
       DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
       LocalDate localDate = LocalDate.parse("2023-10-11", formatter);
       String format = localDate.format(formatter);

       System.out.println(formatter);
       System.out.println(localDate);
       System.out.println(format);
    }

    @Test
    void testInternalization(){
        Locale locale = new Locale("id", "ID");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale);

        LocalDate localDate = LocalDate.now();
        String format = localDate.format(formatter);
        System.out.println(format);

    }

}
