package strings;

public class UnicodeChars {
    public static void main(String[] args) {
        // Unicode characters in Java can be represented using the \\uXXXX notation
        // where XXXX is a hexadecimal number representing the character code.

        // Example: Unicode for 'A' is U+0041
        char unicodeCharA = '\u0041';
        System.out.println("Unicode character for 'A': " + unicodeCharA);

        // Example: Unicode for '€' (Euro sign) is U+20AC
        char unicodeCharEuro = '\u20AC';
        System.out.println("Unicode character for '€': " + unicodeCharEuro);

        // Example: Unicode for '😊' (Smiling Face with Smiling Eyes) is U+1F60A
        String unicodeCharSmile = "\uD83D\uDE0A"; // Surrogate pair for emoji
        System.out.println("Unicode character for '😊': " + unicodeCharSmile);

        StringBuilder b = new StringBuilder();
        for (char c = 'a'; c<'d'; c++) {
            b.append(c);
        }
        b.append('\u00a5');  // Japanese Yen symbol
        b.append('\u01FC');  // Roman AE with acute accent
        b.append('\u0391');  // GREEK Capital Alpha
        b.append('\u03A9');  // GREEK Capital Omega

        for (int i=0; i<b.length(); i++) {
            System.out.printf(
                    "Character #%d (%04x) is %c%n",
                    i, (int)b.charAt(i), b.charAt(i));
        }
        System.out.println("Accumulated characters are " + b);

        // Let's show Santa (0x1f385) + Star (0x2600):
        int[] codePoints = {0x1f385, 0x2600};
        String faceAndStar = new String(codePoints, 0, codePoints.length);
        System.out.println(faceAndStar);    // "🎅☀"
    }
}
