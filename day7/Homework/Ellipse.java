import java.util.*;

/**
 * Class Ellipse, that has constructor and method that counts it's square
 * @author Dima Turenko 09/08/2016
 * */
public class Ellipse extends Figure {
    private double radius1;
    private double radius2; 

    public Ellipse(double radius1, double radius2) { //constructor with r1 and r2 as params
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    /**
     * method that counts square
     * @return square of Ellipse
     * */
    public double area() {
        double ellipseSquare = Math.PI * radius1 * radius2;
        return ellipseSquare;
    }
}
