import java.util.*;
import java.io.*;

class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double pi = 0.0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) pi += (double)1/(1 + 2 * i);
            else pi -= (double)1/(1 + 2 * i);
        }
        System.out.println("FOR : " + pi * 4);

        pi = 0.0;
        int i = 0;
        while (i < n) {
            if (i % 2 == 0) pi += (double)1/(1 + 2 * i);
            else pi -= (double)1/(1 + 2 * i);
            i++;
        }
        System.out.println("WHILE : " + pi * 4);
    }
}
