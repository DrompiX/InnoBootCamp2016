import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.Base64;
import java.util.Scanner;

public class Task2 {
    private static boolean checkPassword(String string) {
        if (string.charAt(0) == '%' && string.charAt(8) == '7' && string.hashCode() % 45 == 45) {
            return true;
        }
        return false;
    }

    private static String getSecret() {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] arrby = decoder.decode("SW5ub3BvbGlzIEJvb3RDYW1wIHNlY3JldCBzdHJpbmc=");
        String string = new String(arrby, Charset.forName("ascii"));
        return string;
    }

    public static void main(String[] arrstring) {
        /*System.out.println("Please enter your password:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (Task2.checkPassword(string)) {*/
        String string2 = Task2.getSecret();
        System.out.println("Secret: " + string2);
        /*} else {
            System.out.println("Sorry, password is wrong");
        }*/
    }
}
