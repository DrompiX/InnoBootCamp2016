import java.io.*;
import java.util.Scanner;

/** 
 * @author Dima Turenko, date : 05/08/2016
 * */
public class Ascii {
    /**
     * Method reads String.
     *
     * @return reading string if posssible, and throws exception if impossible to open file.
     * */
    private static String readString() {
        String intermediate = "";
        try (Scanner in = new Scanner(new FileReader("input.txt"))) {
            while (in.hasNextLine()) {
                intermediate += in.nextLine() + "\n";
            }
        } catch (IOException ex) {}
        return intermediate;
    }

    /**
     * Method writes String. 
     * */
    private static void writeString(String s) { 
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt"), "ascii"))) { 
                writer.write(s); 
        } catch (IOException ex) {}
    }
    
    /**
     * Main method that solves our task.
     * */
    public static void main(String[] args) {
        String text;
        text = readString();
        int counter = 0; 
        int len = text.length();           
        String result = "";
        while (counter < len) {
            char currentSymbol = text.charAt(counter);
            switch (currentSymbol) {
                case 'o':
                case 'O':
                case '.':
                case '`':
                case '\'':
                    result += "X";
                    break;
                case ' ':
                    result += " ";
                    break;
                case '\n':
                    result += "\n";
                    break;
            }
            counter++;
        }
        writeString(result);
    }
}
