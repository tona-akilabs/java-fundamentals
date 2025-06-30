package strings;

public class StringAlign2 {
    public enum Justify { LEFT, CENTER, RIGHT }

    private int width;
    private Justify justify;

    public StringAlign2(int width, Justify justify) {
        this.width = width;
        this.justify = justify;
    }

    public String format(String text) {
        if (text.length() >= width) {
            return text;
        }

        int padding = width - text.length();

        return switch (justify) {
            case LEFT -> text + " ".repeat(padding);
            case RIGHT -> " ".repeat(padding) + text;
            case CENTER -> {
                int padLeft = padding / 2;
                int padRight = padding - padLeft;
                yield " ".repeat(padLeft) + text + " ".repeat(padRight);
            }
        };
    }
}
