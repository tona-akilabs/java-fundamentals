package oo.shapes;

public class Rectangle extends Shape {

    double width, height;
    /**
     * Constructor for Rectangle.
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double computeArea() {
        return width * height;
    }
}
