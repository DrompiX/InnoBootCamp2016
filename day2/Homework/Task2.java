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

    public static void main(String[] args) {
        double d = readDouble();
        long ed_d = Double.doubleToLongBits(d);
        long sign = ed_d << 63;
        long exponent = (ed_d & 0xFFFL) << 51;
        long significand = ed_d >>> 12;
        ed_d = sign | exponent | significand;
        writeString(Double.toString(Double.longBitsToDouble(ed_d)));
    }
}

