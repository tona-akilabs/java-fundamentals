package datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class MeetingDates {
    public static void main(String[] args) {
        DateTimeFormatter dfm = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        int weekOfMonth = 1; // 1st, 2nd, 3rd, or 4th week of the month
        DayOfWeek dayOfWeek = DayOfWeek.WEDNESDAY; // e.g., MONDAY, TUESDAY, etc.
        for (int monthAway = 0; monthAway <= 2; monthAway++) {
            LocalDate dt = getNextMeeting(weekOfMonth, dayOfWeek, monthAway);
            System.out.println(dt.format(dfm));
        }
    }

    public static LocalDate getNextMeeting(
            int weekOfMonth,
            DayOfWeek dayOfWeek,
            int meetingsAway) {
        LocalDate now = LocalDate.now();
        LocalDate thisMeeting = now.with(
                TemporalAdjusters.dayOfWeekInMonth(weekOfMonth,dayOfWeek));
        // Has the meeting already happened this month?
        if (thisMeeting.isBefore(now)) {
            // start from next month
            meetingsAway++;
        }
        if (meetingsAway > 0) {
            thisMeeting = thisMeeting.plusMonths(meetingsAway).
                    with(TemporalAdjusters.dayOfWeekInMonth(weekOfMonth,dayOfWeek));
        }
        return thisMeeting;
    }
}
