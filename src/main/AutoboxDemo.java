package main;

public class AutoboxDemo {
    /** Shows auto-boxing (in the call to foo(i), i is wrapped automatically)
     * and auto-unboxing (the return value is automatically unwrapped).
     */
    public static void main(String[] args) {
        int i = 42;
        int result = foo(i);
        System.out.println(result);

        // int to Integer
        Integer wrapped = Integer.valueOf(42);
        System.out.println(wrapped.toString());    // or just "wrapped"

        // Integer to int
        int primitive = wrapped.intValue();
        System.out.println(primitive);
    }

    public static Integer foo(Integer i) {
        System.out.println("Object = " + i);
        return Integer.valueOf(123);
    }
}
