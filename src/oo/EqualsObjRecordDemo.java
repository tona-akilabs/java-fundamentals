package oo;

import record.RecordDemo;

public class EqualsObjRecordDemo {
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
            EqualsObjRecordDemo.Person p1 = new EqualsObjRecordDemo.Person("Alice", 30);
            System.out.println("Person: " + p1.name() + ", Age: " + p1.age());

            // This will throw an exception
            EqualsObjRecordDemo.Person p2 = new EqualsObjRecordDemo.Person("Alice", 30);
            System.out.println("Person: " + p2.name() + ", Age: " + p2.age());

            System.out.println(p1.equals(p2));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
