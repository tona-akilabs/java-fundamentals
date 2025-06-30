package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Formatter;

public class FormatterDemo {
    public static void main(String[] args) throws IOException {

        String name = "Alice";
        java.util.Date now = new java.util.Date();
        var str = String.format("Hello %s, today is %tF%n", name, now);
        var str2 = "Hello %s, today is %tF%n".formatted(name, now);
        System.out.println(str);
        System.out.println(str2);

        // To output the formatted result:
        System.out.printf("%04d - the year of %f%n", 1956, Math.PI);
        // or, more formally:
        System.out.printf("%1$04d - the year of %2$f%n", 1956, Math.PI);

        // The arguments to all these format methods consist of
        // a format code String and 1 or more arguments.
        // Each format code consists of the following:
        // % - code lead-in
        // N$ - OPTIONAL parameter number (1-based) after the format code
        // N - field width
        // L - format letter (d: decimal(int); f: float; s: general; many more)

        // Most general (cumbersome) way of proceeding.
        Formatter fmtr = new Formatter();
        // The format() method returns a Formatter, so use Object
        Object result = fmtr.format("%1$04d - the year of %2$f", 1956, Math.PI);
        System.out.println(result);

        // Shorter way using static String.format(), default parameter numbering.
        String stringResult = "%04d - the year of %f".formatted(1956, Math.PI);
        System.out.println(stringResult);

        // A shorter way using PrintStream/PrintWriter.format, more in line with
        // other languages. Using this way, you should provide the newline delimiter
        // using %n (rather than \n as that is platform-dependent!).
        System.out.printf("%04d - the year of %f%n", 1956, Math.PI);

        // Format doubles with more control
        System.out.printf("PI is approximately %4.2f%n", Math.PI);

        final String TMPFILE = "format-demo.txt";
        Formatter fmt2 = new Formatter(TMPFILE);
        fmt2.format(
                "This is a %s opportunity that you can get in for just $%5.2f!%n",
                "new", 27.99);
        fmt2.close();

        String result2 = Files.readString(Path.of(TMPFILE));
        System.out.print("String from file is: " + result2);
    }
}
