package arifRizal.datetime;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest {
    @Test
    void testDuration(){
        Duration duration = Duration.ofSeconds(30);
        Duration duration1 = Duration.ofHours(1);
        Duration duration2 = Duration.ofMinutes(30);

        System.out.println(duration);
        System.out.println(duration1);
        System.out.println(duration2);
    }

    @Test
    void testGetDuration() {
       Duration duration = Duration.ofHours(10);
       long days = duration.toDays();
       long hours= duration.toHours();
       long minutes = duration.toMinutes();
       long seconds = duration.getSeconds();
       long nanos = duration.toNanos();

        System.out.println(duration);
        System.out.println(days);
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
        System.out.println(nanos);
    }

    @Test
    void testCountDuration(){
        Duration duration = Duration.between(LocalTime.of(10, 10), LocalTime.of(20, 10));
        Duration duration1= Duration.between(LocalDateTime.now(), LocalDateTime.now().plusHours(12));

        System.out.println(duration);
        System.out.println(duration1);
    }


}
