package oo.shapes;

import java.util.Collection;
import java.util.List;

/** Part of a main program using Shape objects */
public class ShapeDriver {
    Collection<Shape> allShapes;  // created in a Constructor, not shown

    /** Iterate over all the Shapes, getting their areas;
     * this cannot use the Java 8 Collection.forEach because the
     * variable total would have to be final, which would defeat the purpose :-)
     */
    public double totalAreas() {
        double total = 0.0;
        for (Shape s : allShapes) {
            total += s.computeArea();
        }
        return total;
    }

    public static void main(String[] args) {
        ShapeDriver driver = new ShapeDriver();
        driver.allShapes = List.of(
            new Circle(5.0),  // Assume Circle constructor takes radius
            new Rectangle(4.0, 6.0)  // Assume Rectangle constructor takes width and height
        );
        // Assume allShapes is populated with Circle and Rectangle objects
        double totalArea = driver.totalAreas();
        System.out.println("Total area of all shapes: " + totalArea);
    }
}
