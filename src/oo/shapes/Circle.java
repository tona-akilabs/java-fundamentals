package oo.shapes;

public class Circle extends Shape {
    double radius;
    /**
     * Constructor for Circle.
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }
    public double computeArea( ) {
        return Math.PI * radius * radius;
    }
}
