import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        
        String str =  in.nextLine();
        //out.write(str + "\n");

        String[] strParts = str.split(" ");
        int len = strParts.length;

        for (int i = 0; i < len; i++) {
            switch(strParts[i]) {
                case "one":
                    strParts[i] = "1";
                    break;
                case "two":
                    strParts[i] = "2";
                    break;
                case "three":
                    strParts[i] = "3";
                    break;
                case "four":
                    strParts[i] = "4";
                    break;
                case "five":
                    strParts[i] = "5";
                    break;
                case "six":
                    strParts[i] = "6";
                    break;
                case "seven":
                    strParts[i] = "7";
                    break;
                case "eight":
                    strParts[i] = "8";
                    break;
                case "nine":
                    strParts[i] = "9";
                    break;
                case "ten":
                    strParts[i] = "10";
                    break;
            }
        }

        for (int i = 0; i < len; i++) {
            out.write(strParts[i] + " ");
        }
        out.close();
    }
}
