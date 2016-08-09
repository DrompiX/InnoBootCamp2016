import java.util.*;
    
/**
 * Class Square, that has constructor and method that counts it's square
 * @author Dima Turenko 09/08/2016
 * */
public class Square extends Figure {
    private double side;

    public Square(double side) { //constructor with side as a param
        this.side = side;
    }

    /**
     * method that counts square
     * @return square of Square
     * */
    public double area() {
        double square = side * side;
        return square;
    }
}
