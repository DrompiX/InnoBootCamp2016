import java.util.*;
import java.io.*;

class Main {
    
    /**
     * Method main, enter point.
     *
     * @since version 1.1
     * @param args
     * */

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        String s = in.nextLine();
        Task.setTask(s);
        Task.solve(out); 
        out.close();
    }
}

class Task {
    public static String ourTask;
    
    /**
     * Method changes s value.
     * 
     * @param a 
     * @author Dima Turenko
     * */

    public static void setTask(String a) {
        ourTask = a;
    }

    /**
     * Method solves the task, using String replace() and replaceAll() methods that
     * change one substring to another.
     *
     * @param out - output in the file 
     * */

    public static void solve(PrintWriter out) {
        ourTask = ourTask.replaceAll("PLZ", "please");
        ourTask = ourTask.replaceAll("FYI", "for your information");
        ourTask = ourTask.replaceAll("GTFO", "please, leave me alone");
        ourTask = ourTask.replaceAll("ASAP", "as soon as possible");
        ourTask = ourTask.replace(":)", "[smiling]");
        ourTask = ourTask.replace(":(", "[sad]");
        ourTask = ourTask.replace("¯ \\ _ (ツ) _ / ¯", "[such is life]");
        out.write(ourTask);
    }
}

