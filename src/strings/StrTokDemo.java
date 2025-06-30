package strings;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrTokDemo {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello World of Java");
        while (st.hasMoreTokens())
            System.out.println("Token: " + st.nextToken());

        String inputString = "Course numbers: 101, 202, 303";
        Matcher tokenizer = Pattern.compile("\\d+").matcher(inputString);
        while (tokenizer.find()) {
            String courseString = tokenizer.group(0);
            int courseNumber = Integer.parseInt(courseString);
            System.out.println("Course number: " + courseNumber);
        }
    }
}
