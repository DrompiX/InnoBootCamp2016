import java.util.*;

/**
 * Class Circle, that has constructor and method that counts it's square
 * @author Dima Turenko 09/08/2016
 * */
public class Circle extends Ellipse {

    public Circle(double radius) throws ArguesInvalidEx { //constructor with radius as a param
        super(radius, radius); //calling parent's constructor with two radiuses as a params to radius1, radius2
    }
}
