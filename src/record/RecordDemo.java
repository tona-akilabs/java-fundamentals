package record;

public class RecordDemo {
    // java 16+ (data objects)
    record Person(String name, int age) {
        // Constructor with validation
        public Person {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
        }
    }

    public static void main(String[] args) {
        try {
            Person p1 = new Person("Alice", 30);
            System.out.println("Person: " + p1.name() + ", Age: " + p1.age());

            // This will throw an exception
            Person p2 = new Person("Bob", 40);
            System.out.println("Person: " + p2.name() + ", Age: " + p2.age());
            System.out.println(p2);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
