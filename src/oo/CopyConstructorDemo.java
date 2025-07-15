package oo;

import java.util.Objects;

public class CopyConstructorDemo {
    public static void main(String[] args) {
        CopyConstructorDemo object1 = new CopyConstructorDemo(123, "Hello");
        CopyConstructorDemo object2 = new CopyConstructorDemo(object1);
        if (!object1.equals(object2)) {
            System.out.println("Something is terribly wrong...");
        }
        System.out.println("All done.");
    }

    private int number;
    private String name;

    /** Default constructor */
    public CopyConstructorDemo()  {
    }

    /** Normal constructor */
    public CopyConstructorDemo(int number, String name)  {
        this.number = number;
        this.name = name;
    }

    /** Copy Constructor */
    public CopyConstructorDemo(CopyConstructorDemo other)  {
        this.number = other.number;
        this.name = other.name;
    }

    /*@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CopyConstructorDemo that = (CopyConstructorDemo) obj;
        return number == that.number &&
                (Objects.equals(name, that.name));
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(number);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }*/
}
