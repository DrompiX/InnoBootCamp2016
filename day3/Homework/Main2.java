import java.util.*;
import java.io.*;

class Main2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        String s = in.nextLine();
        char[] ch = s.toCharArray();
        int x = 0, y = 0;
        for (int i = 0; i < ch.length; i++) {
            switch(ch[i]) {
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }
        }
        out.write(x + " " + y);
        out.close();
    }
}
