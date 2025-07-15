package oo;

import java.util.Objects;

public class SomeClass {
    private int id;
    private String name;

    public SomeClass() {
        this.id = 0; // Default value for id
        this.name = "None"; // Default value for name
    }

    public SomeClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check for reference equality
        if (obj == null || getClass() != obj.getClass()) return false; // Check for null or different class
        SomeClass that = (SomeClass) obj; // Cast to SomeClass
        return id == that.id && Objects.equals(name, that.name); // Compare fields
    }

    /*@Override
    public int hashCode() {
        return Objects.hash(id, name); // Generate hash code based on fields
    }*/
}
