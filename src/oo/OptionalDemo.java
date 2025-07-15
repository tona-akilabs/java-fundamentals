package oo;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List.of(
                        new Item("Item 1", LocalDate.now().plusDays(7)),
                        new Item("Item 2")).
                forEach(System.out::println);
    }

    static class Item {
        String name;
        Optional<LocalDate> dueDate;
        Item(String name) {
            this(name, null);
        }
        Item(String name, LocalDate dueDate) {
            this.name = name;
            this.dueDate = Optional.ofNullable(dueDate);
        }

        public String toString() {
            return "%s %s".formatted(name,
                    dueDate.isPresent() ?
                            "Item is due on " + dueDate.get() :
                            "Sorry, do not know when item is due");
        }
    }
}
