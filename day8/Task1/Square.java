import java.util.*;
    
/**
 * Class Square, that has constructor and method that counts it's square
 * @author Dima Turenko 09/08/2016
 * */
public class Square extends Rectangle {

    public Square(double side) { //constructor with side as a param
        super(side, side); //calling parent's construcror with side and side parametrs as a length and width
    }
}
