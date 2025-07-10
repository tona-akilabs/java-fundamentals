package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateParse {
    public static void main(String[] args) {

        String armisticeDateString = "1918-11-11";
        LocalDate armisticeDate = LocalDate.parse(armisticeDateString);
        System.out.println("Date: " + armisticeDate);

        String armisticeDateTimeString = "1918-11-11T11:00";
        LocalDateTime armisticeDateTime =
                LocalDateTime.parse(armisticeDateTimeString);
        System.out.println("Date/Time: " + armisticeDateTime);
    }
}
