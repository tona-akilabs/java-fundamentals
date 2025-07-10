package numbers;

public class ComplexDemoACM {
    public static void main(String[] args) {
        Complex c = new Complex(3,  5);
        Complex d = new Complex(2, -2);
        System.out.println(c);
        System.out.println(c + ".getReal() = " + c.getReal());
        System.out.println(c + " + " + d + " = " + c.add(d));
        System.out.println(c + " * " + d + " = " + c.multiply(d));
        //System.out.println(c.divide(d));
    }
}
