import java.util.*;

/**
 * Class Box, that has constructor and method that counts it's square
 * @author Dima Turenko 09/08/2016
 * */
public class Box extends Figure {
    private double length; 
    private double width;
    private double height;

    public Box(double length, double width, double height) { //constructor with l, w, h, as a params
        this.length = length;
        this.height = height;
        this.width = width;
    }

    /**
     * method that counts square
     * @return square of Box
     * */
    public double area() { 
        double boxSquare = 2 * (length * width + length * height + width * height); //using of formula
        return boxSquare;
    }
}
