import java.util.*;
import java.io.*;

class Main2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        double d = in.nextDouble();
        out.print(d);
    }
}
