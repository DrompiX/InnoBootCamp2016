import java.util.*;

class Task2 {
    public static void main(String[] args) {
        long a = gimmeNumber();
        System.out.println(a);
        int len = giveCnt(a);
        int num = 0;
        for (int i = 0; i < len; i++) {
            long x = a % 10;
            for (int j = 0; j < i; j++)
                x *= 2;
            num += x;
            a /= 10;
        }
        System.out.println(num);
    }
    
    public static long gimmeNumber() {
        Random rand = new Random();
        long result = 0;
        for (int i = 0; i < 16; i++) {
            result *= 10;
            result += rand.nextInt(2);
        }
        return result;
    }

    public static int giveCnt(long n) {
        int cnt = 0;
        while (n > 0) {
            cnt++;
            n /= 10;
        }
        return cnt;
    }
}
