package io;

import java.time.LocalDate;

/*import static java.lang.StringTemplate.RAW;
import static java.lang.StringTemplate.STR;
import static java.util.FormatProcessor.FMT;*/

public class FormatterDates {
    public static void main(String[] args) throws RuntimeException {
        // Example of formatting dates using String.format and DateTimeFormatter
        java.time.LocalDate today = java.time.LocalDate.now();
        java.time.LocalDate birthday = java.time.LocalDate.of(1990, 5, 15);

        // Using String.format
        String formattedToday = String.format("Today's date is: %tF", today);
        String formattedBirthday = String.format("My birthday is: %tF", birthday);

        System.out.println(formattedToday);
        System.out.println(formattedBirthday);

        // Using DateTimeFormatter for more control
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String customFormattedToday = today.format(formatter);
        String customFormattedBirthday = birthday.format(formatter);

        System.out.println("Custom formatted today: " + customFormattedToday);
        System.out.println("Custom formatted birthday: " + customFormattedBirthday);

        // Format number as dates e.g., 2026-06-28
        System.out.printf("%4d-%02d-%2d%n", 2026, 6, 28);

        // Format fields directly from a Date object: multiple fields from "1$"
        // (hard-coded formatting for Date not advisable; see I/O chapter)
        LocalDate today2 = LocalDate.now();
        // Print in a form like e.g., "July 4, 2026"
        System.out.printf("Today is %1$tB %1$td, %1$tY%n", today2);

        // Using String.format with named parameters (Java 21+)
        /*String name = "Alice";
        LocalDate now = LocalDate.now();
        var str3 = STR."Hello \{name}, today is \{now}";
        var str4 = RAW."Hello \{name}, today is \{now}";
        var str5 = FMT."Hello \{name}, today is \{now}";
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);*/
    }
}
