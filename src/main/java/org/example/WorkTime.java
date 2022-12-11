package org.example;
import java.time.*;

public class WorkTime {

    static Instant start;
    static Instant finish;

    static void StartTime() {
        start = Instant.now();
    }

    static void StopTime() {
        finish = Instant.now();
        long elapsed = Duration.between(start, finish).toMillis();
        System.out.println("Прошло времени, мс: " + elapsed);
    }

}
