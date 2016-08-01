import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        File in = new File("input.txt");
        File out = new File("output.txt");
        
        try(FileReader reader = new FileReader(in)) {
            char[] str = new char[(int)in.length()];
            reader.read(str);
            for (int i = 0; i < str.length; i++) {
                if ((int)str[i] > 96 && (int)str[i] < 123) {
                    str[i] = (char)(str[i] - 32);
                }
            }
            try (FileWriter writer = new FileWriter(out)) {
                writer.write(str);
            }
            catch(IOException ex) {}
        }
        catch(IOException ex) {}
    }
}
