package oo;

public class EqualsObj {
    private int int1;
    private SomeClass obj1;

    /** Constructor */
    public EqualsObj(int i, SomeClass o) {
        int1 = i;
        if (o == null) {
            throw new IllegalArgumentException("Data Object may not be null");
        }
        obj1 = o;
    }

    /** Default Constructor */
    public EqualsObj() {
        this(0, new SomeClass());
    }

    /** Demonstration "equals" method */
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        // Of the correct class?
        if (o.getClass() != EqualsObj.class) {
            return false;
        }

        EqualsObj other = (EqualsObj)o; // OK, cast to this class

        // compare field-by-field
        if (int1 != other.int1) {          // compare primitives directly
            return false;
        }
        if (!obj1.equals(other.obj1)) {     // compare objects using their equals
            return false;
        }
        return true;
    }

    /** Demonstration "hashCode" method *//*
    @Override
    public int hashCode() {
        // Use a prime number to combine the hash codes of the fields
        int result = 17; // Start with a non-zero constant
        result = 31 * result + int1; // Combine with the hash code of the primitive
        result = 31 * result + (obj1 != null ? obj1.hashCode() : 0); // Combine with the hash code of the object
        return result;
    }*/
}
