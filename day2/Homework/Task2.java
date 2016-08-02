import java.io.*;
import java.util.*;

public class Task2 {
    private static double readDouble() {
        try {
            return new Scanner(new File("input.txt")).useLocale(Locale.US).nextDouble();
        } catch (FileNotFoundException ex) {
            return -1;
        }
    }
    
    private static void writeString(String s) {
        try {
            try (Writer writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("output.txt"), "ascii"))) {
                writer.write(s);
            }
        } catch (IOException ex) {
        }
    }

    private static String readString() {
        try {
            return new Scanner(new File("input.txt")).nextLine();
        } catch (FileNotFoundException ex) {
            return null;
        }
    }

    private static void writeDouble(double number) {
        writeString(Double.toString(number));
    }

    public static void main(String[] args) {
        double d = readDouble();
        long lbits = Double.doubleToLongBits(d);
        //long ld = Double.doubleToLongBits(d);
        System.out.println(ld);
        String str = "";
        while (ld > 0) {
            if (ld % 2 == 1) str += '1';
            else str += '0';
            ld /= 2;
        }

        String str2 = new StringBuffer(str).reverse().toString();
        System.out.println(str2);
        long sign = 0;
        long ext = Long.parseLong(str2);
        sign = ext % 10; ext /= 10;
        System.out.println(ext);
        int j = 0;
        long exp;
        for (int i = 0; i < 11; i++) {
            if (i <= str.length()) {
                
            }
        }
        /*long lsign = lbits >>> 63; // знак
        long lexp = (lbits >>> 52 & ((1 << 11) - 1)) - ((1 << 10) - 1); // порядок
        long lmantissa = lbits & ((1L << 52) - 1); // мантисса
        long t = lmantissa;
        lmantissa = lsign;
        lsign = lmantissa;
        System.out.println(lsign + " " + lexp + " " + lmantissa);
        System.out.println(Double.longBitsToDouble((lsign << 63) | (lexp + ((1 << 10) - 1)) << 52 | lmantissa));*/
    }
}

