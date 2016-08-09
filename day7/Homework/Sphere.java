import java.util.*;

/**
 * Class Sphere, that has constructor and method that counts it's square 
 * @author Dima Turenko 09/08/2016
 * */
public class Sphere extends Figure {
    private double radius;

    public Sphere(double radius) { //constructor with radius param
        this.radius = radius;
    }

    /**
     * method that counts square
     * @return square of Sphere
     * */
    public double area() {
        double sphereSquare = 4 * Math.PI * radius * radius;
        return sphereSquare;
    }
}
