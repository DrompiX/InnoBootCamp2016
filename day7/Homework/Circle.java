import java.util.*;

/**
 * Class Circle, that has constructor and method that counts it's square
 * @author Dima Turenko 09/08/2016
 * */
public class Circle extends Figure {
    private double radius;

    public Circle(double radius) { //constructor with radius as a param
        this.radius = radius;
    }

    /**
     * method that counts square
     * @return square of Circle
     * */
    public double area() {
        double circleSquare = Math.PI * radius * radius;
        return circleSquare;
    }
}
