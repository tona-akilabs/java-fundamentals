package strings;

public class StringBuilderCommaList {
    public static void main(String[] args) {
        final String SAMPLE_STRING = "This is a sample string to demonstrate how to create a comma-separated list using StringBuilder.";
        System.out.println(
                "Split using String.split; joined using 1.8 String join");
        System.out.println(String.join(", ", SAMPLE_STRING.split(" ")));

        System.out.println(
                "Split using String.split; joined using StringBuilder");
        StringBuilder sb1 = new StringBuilder();
        for (String word : SAMPLE_STRING.split(" ")) {
            if (sb1.length() > 0) {
                sb1.append(", ");
            }
            sb1.append(word);
        }
        System.out.println(sb1);
    }
}
