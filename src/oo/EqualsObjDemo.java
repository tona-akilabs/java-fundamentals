package oo;

public class EqualsObjDemo {
    public static void main(String[] args) throws Exception {
        // Create two EqualsObj instances with the same values
        SomeClass someClassInstance = new SomeClass(12, "Developer");
        EqualsObj obj1 = new EqualsObj(42, someClassInstance);
        EqualsObj obj2 = new EqualsObj(42, someClassInstance);
        EqualsObj obj3 = new EqualsObj(43, new SomeClass());
        EqualsObj obj4 = new EqualsObj(43, new SomeClass());
        //EqualsObj obj5 = new EqualsObj(42, null); // This will throw an exception

        // Test equality
        System.out.println("obj1 equals obj2: " + obj1.equals(obj2)); // Should be true
        System.out.println("obj1 equals obj3: " + obj1.equals(obj3)); // Should be false
        System.out.println("obj3 equals obj4: " + obj3.equals(obj4)); // Should be true
    }
}
