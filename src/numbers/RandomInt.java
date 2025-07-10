package numbers;

import java.util.Random;

public class RandomInt {
    public static void main(String[] a) {
        // java.lang.Math.random( ) is static, so you don't need any constructor calls
        System.out.println("A random from java.lang.Math is " + Math.random( ));

        // java.util.Random is an object, so you need to create an instance
        Random r = new Random();
        for (int i=0; i<1000; i++)
            // nextInt(10) goes from 0-9; add 1 for 1-10;
            System.out.println(1+r.nextInt(10));
    }
}
