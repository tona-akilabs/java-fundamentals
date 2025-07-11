package datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class LocalDateDemo {
    public static void main(String[] args) {
        // Create a LocalDate instance for today
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        // Create a LocalDate instance for a specific date
        LocalDate specificDate = LocalDate.of(2023, 10, 1);
        System.out.println("Specific date: " + specificDate);

        // Parse a date from a string
        String dateString = "2023-10-15";
        LocalDate parsedDate = LocalDate.parse(dateString);
        System.out.println("Parsed date: " + parsedDate);

        // Check if two dates are equal
        boolean isEqual = today.equals(parsedDate);
        System.out.println("Is today equal to parsed date? " + isEqual);

        // Add days to a date
        LocalDate localDate = LocalDate.now().plus(Period.of(4,-1,12));
        System.out.println("Date after adding 4 days, -1 month, and 12 years: " + localDate);

        // Create a Duration instance
        Duration duration = Duration.ofHours(2).plusMinutes(30);
        System.out.println(duration); // PT2H30M

        /*Duration duration = Duration.ofHours(12).plusHours(4).plusMillis(3).plusMinutes(6);
        System.out.println("Duration: " + duration); PT16H6M0.003S*/
    }
}
