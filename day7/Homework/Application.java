import java.util.*;
import java.io.*;

/**
 * Program counts different figure's squares
 * -----------------------------------------
 * IMPORTANT ! : in my program word square == area, only class Figure is [](Квадрат)
 * -------------------------------
 * @author Dima Turenko 09/08/2016
 * */
public class Application {
    public static void main(String[] args) throws IOException  {
        Scanner in = new Scanner(new FileReader("input.txt")); //open file to read
        PrintWriter out = new PrintWriter(new FileWriter("output.txt")); //open file to write
        while (in.hasNextLine()) { //while remain one and more line in file we do :
            String figureName = in.next(); //reading figure's name
            switch(figureName) { 
                case "Ellipse": 
                    ellipseSquare(in, out); //if name is Ellipse then count Ellipse's square
                    break;
                case "Box": 
                    boxSquare(in, out); //if name is Box then count Box's square
                    break;
                case "Circle": 
                    circleSquare(in, out); //if name is Circle then count Circle's square
                    break;
                case "Rectangle": 
                    rectangleSquare(in, out); //if name is Rectangle then count it's square
                    break;
                case "Sphere": 
                    sphereSquare(in, out); //if name is Sphere then count it's square
                    break;
                case "Square": 
                    square(in, out); //if name is Square then count it's square
                    break;
            }
            String s;
            if (in.hasNextLine())
                s = in.nextLine(); //move to next line (it looks like magic)
        }
        out.close(); //closing ouput file 
        //end of the program
    }
    
    /**
     * This method counts Ellipse square, using (pi*r*R) formula
     *
     * @param in, out - files for reading, writing
     * */
    public static void ellipseSquare(Scanner in, PrintWriter out) {                
        double r1 = Double.parseDouble(in.next()); //read r1 value
        double r2 = Double.parseDouble(in.next()); //read r2 value
        Ellipse ellipse = new Ellipse(r1, r2); //creating new Ellipse object
        double square = ellipse.area(); //counting square
        out.write(square + "\n"); //outputting square
    }

    /**
     * This method counts Box's square, using (2*(l * w + l * h + w * h)) formula
     *
     * @param in, out - files for reading, writing
     * */
    public static void boxSquare(Scanner in, PrintWriter out) {
        double length = Double.parseDouble(in.next()); 
        double width = Double.parseDouble(in.next());
        double height = Double.parseDouble(in.next()); //reading of 3 values : l, w, h
        Box box = new Box(length, width, height); //creating new Box object 
        double square = box.area(); //counting square
        out.write(square + "\n"); //outputting square
    }
    
    /**
     * This method counts Square's square, using (side * side) formula
     *
     * @param in, out - files for reading, writing
     * */
    public static void square(Scanner in, PrintWriter out) {
        double side = Double.parseDouble(in.next()); //reading of side value
        Rectangle ourSquare = new Square(side); //creating new Square object
        double sq = ourSquare.area(); //counting square
        out.write(sq + "\n"); //outputting square
    }
 
    /**
     * This method counts Circle's square, using (pi*r*r) formula
     *
     * @param in, out - files for reading, writing
     * */
    public static void circleSquare(Scanner in, PrintWriter out) {
        double radius = Double.parseDouble(in.next()); //reading of it's radius
        Circle circle = new Circle(radius); //creating new Circle object
        double square = circle.area(); //counting square
        out.write(square + "\n"); //outputting square
    }

    /**
     * This method counts Rectangle's square, using (length * width) formula
     *
     * @param in, out - files for reading, writing
     * */
    public static void rectangleSquare(Scanner in, PrintWriter out) {
        double length = Double.parseDouble(in.next()); //reading of it's length
        double width = Double.parseDouble(in.next()); //reading of it's width
        Rectangle rectangle = new Rectangle(length, width); //creating new Rectangle object
        double square = rectangle.area(); //counting square
        out.write(square + "\n"); //outputting square
    }
    
    /**
     * This method counts Sphere's square, using (4 * pi * r * r) formula
     *
     * @param in, out - files for reading, writing
     * */
    public static void sphereSquare(Scanner in, PrintWriter out) {
        double radius = Double.parseDouble(in.next()); //reading of it's radius    
        Sphere sphere = new Sphere(radius); //creating new Sphere object
        double square = sphere.area(); //counting square
        out.write(square + "\n"); //outputting square
    }
}
