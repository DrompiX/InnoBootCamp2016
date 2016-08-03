import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        TaskA solver = new TaskA();
        solver.solve(in, out);
        out.close();
    }


