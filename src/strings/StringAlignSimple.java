package strings;

public class StringAlignSimple {
    public static void main(String[] args) {
        // This is a simple example of how to use the StringAlign class
        // Example of using StringAlign class
        // Construct a "formatter" to center strings.
        StringAlign formatter = new StringAlign(70, StringAlign.Justify.CENTER);
        // Try it out, for page "i"
        System.out.println(formatter.format("- i -"));
        // Try it out, for page 4. Since this formatter is
        // optimized for Strings, not specifically for page numbers,
        // we have to convert the number to a String
        System.out.println(formatter.format(Integer.toString(4)));

        // Example of using StringAlign2 class
        StringAlign2 formatter2 = new StringAlign2(70, StringAlign2.Justify.CENTER);
        System.out.println(formatter2.format("- i -"));
        System.out.println(formatter2.format(Integer.toString(4)));
    }
}
