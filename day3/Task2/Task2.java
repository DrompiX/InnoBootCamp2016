import java.util.*;
import java.io.*;

class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum = 2, cnt = 1, num = 3;
        while (cnt < 1000) {
            if (isPrime(num)) {
                sum += num;
                cnt++;
            }
            num++;
        }
        System.out.println(cnt + " " + sum);
    }

    static boolean isPrime(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; 
        }
        return true;
    }
}
