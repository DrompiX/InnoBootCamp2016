import java.util.*;

/**
 * Class Rectangle, that has constructor and method that counts it's square
 * @author Dima Turenko 09/08/2016
 * */
public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) { //constructor with l and w as a params
        this.length = length;
        this.width = width;
    }

    /**
     * method that counts square
     * @return square of Rectangle
     * */
    public double area() {
        double rectangleSquare = length * width;
        return rectangleSquare;
    }
}
