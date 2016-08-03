import java.util.*;
import java.io.*;

class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            boolean log = false;
            System.out.println("write 2 numbers:>");
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println("enter operation:>");
            String s = in.nextLine();
            s = in.nextLine();

            int res = 0;
            switch(s) {
                case "*" :
                    res = a * b;
                    break;
                case "/" :
                    res = a / b;
                    break;
                case "+" :
                    res = a + b;
                    break;
                case "-" :
                    res = a - b;
                    break;
                case "%" :
                    res = a % b;
                    break;
                default :
                    log = true;       
            }
            if (log) break;
            System.out.println("result: " + res);
            
        /*System.out.println("write 2 numbers:>");
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("enter operation:>");
        s = in.nextLine();*/
        }
    }
}
