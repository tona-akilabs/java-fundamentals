package structure;

import java.util.Collection;
import java.util.List;

public class IterableForEach {
    public static void main(String[] args) {
        Collection<String> c = List.of("One", "Two", "Three", "Four");
        System.out.println("Using forEach to iterate over a collection:");
        c.forEach(item -> System.out.println("Item: " + item));
    }
}
