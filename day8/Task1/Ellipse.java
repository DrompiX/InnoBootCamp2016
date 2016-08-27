import java.util.*;

/**
 * Class Ellipse, that has constructor and method that counts it's square
 * @author Dima Turenko 09/08/2016
 * */
public class Ellipse extends Figure {
    private double radius1;
    private double radius2; 

    public Ellipse(double radius1, double radius2) throws ArguesInvalidEx{ //constructor with r1 and r2 as params
        if (radius1 >= 0 && radius2 >= 0) {
            this.radius1 = radius1;
            this.radius2 = radius2;
        } else {
            throw new ArguesInvalidEx("radius should be bigger than 0\n");
        }
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
