package arifRizal.datetime;

import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.util.Calendar;

public class CalenderTest {
    @Test
    void testCreate(){
        Calendar calendar = Calendar.getInstance();

        Date date = new Date(calendar.getTimeInMillis());
        System.out.println(date);
    }

    @Test
    void testUpdate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 10);

        java.util.Date date = calendar.getTime();
        Date sqlDate = new Date(date.getTime());
        System.out.println(sqlDate);
        System.out.println(sqlDate.getTime());
        // 2000-01-10
        // 947496339508
    }

}
