import java.util.*;
import java.io.*;

/**
 * Application tries to find intersection of two sections
 *
 * @author Dima Turenko 10/08/2016
 * */
public class Launcher {
    public static void main(String[] args) 
            throws IOException, SectCoincideException, NoIntersectionException {
        Scanner in = new Scanner(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));

        //comments : BLOCK FIRST 
        String read = in.nextLine(); //reading first string of data
        String[] splitedRead1 = read.split(" "); //splitting it
        double[] points1; 
        try { //try to take our doubles from string if it possible
            points1 = tryToDigits(splitedRead1);
        } catch (InvalidInputException ex){ //trow exception if we have invalid input
            out.write(ex.getMessage()); //outputting exception's message
            out.close(); //close output file
            return; //stop program
        }

        if (points1[0] == points1[2] && points1[1] == points1[3]) { //if Section becomes a point
            try {                                                   //we trow excetion that our section
                throw new ZeroLengthException("DEGENERATE");        //is a 0 length
            } catch (ZeroLengthException e) {
                out.write(e.getMessage()); //outputting exception's message
                out.close(); //close output file 
                return; //stop program
            }
        }
        //making first section
        Section one = new Section(new Point(points1[0], points1[1]), new Point(points1[2], points1[3]));
       
        //The same comment as in BLOCK FIRST
        read = in.nextLine(); 
        String[] splitedRead2 = read.split(" ");
        double[] points2;
        try {
            points2 = tryToDigits(splitedRead2);
        } catch (InvalidInputException ex){
            out.write(ex.getMessage());
            out.close();
            return;
        }

        if (points2[0] == points2[2] && points2[1] == points2[3]) {
            try {
                throw new ZeroLengthException("DEGENERATE");
            } catch (ZeroLengthException e) {
                out.write(e.getMessage());
                out.close();
                return;
            }
        }
        Section two = new Section(new Point(points2[0], points2[1]), new Point(points2[2], points2[3]));

        sectionIntersect(one, two, out);
        out.close();
    }

    /**
     * Method tries to find intersection of two Sections if it possible and throws
     * exceptions :
     * COINCIDE - if sections coincide
     * NO INTERSECTION - if sections don't intersect
     * INPUT ERROR - if it's invalid input in the file
     * -----------------------------------------------
     * First of all we try to make straight equations
     *
     * @param one - first section
     * @param two - second section
     * @param out - output 
     * */
    public static void sectionIntersect(Section one, Section two, PrintWriter out) 
                throws SectCoincideException, NoIntersectionException{

    }
    
    /**
     * Method checks the String if it consist from right input(4 double values)
     *
     * @param String[] that contains splitted words from main string
     * @return double[] that contains our values, if there are no exceptions
     * */
    public static double[] tryToDigits(String[] s) throws InvalidInputException {
        double[] points = new double[4];
        if (s.length == 4) { //if more or less than 4 pieces than we throw IIE
            for (int i = 0; i < s.length; i++) {
                try {
                    points[i] = Double.parseDouble(s[i]); 
                } catch (Exception ex) { //trying to catch exception about bad input
                    throw new InvalidInputException("INPUT ERROR");
                }
            }
            return points; //return our double[] 
        } else {
            throw new InvalidInputException("INPUT ERROR"); 
        }
    }
}
