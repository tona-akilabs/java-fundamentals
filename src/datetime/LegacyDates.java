package datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class LegacyDates {
    public static void main(String[] args) {

        // There and back again, via Date
        Date legacyDate = new Date();
        System.out.println(legacyDate);

        LocalDateTime newDate =
                LocalDateTime.ofInstant(legacyDate.toInstant(),
                        ZoneId.systemDefault());
        System.out.println(newDate);

        Date backAgain =
                Date.from(newDate.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("Converted back as " + backAgain);

        // And via Calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        LocalDateTime newCal =
                LocalDateTime.ofInstant(c.toInstant(),
                        ZoneId.systemDefault());
        System.out.println(newCal);
    }
}
