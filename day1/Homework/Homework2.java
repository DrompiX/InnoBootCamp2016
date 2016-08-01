import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class Homework2 {
    static PT softwareType = PT.FREEWARE;

    private static String readFile() {
        try {
            Scanner scanner = new Scanner(new File("input.txt"));
            return scanner.nextLine();
        }
        catch (FileNotFoundException var0_1) {
            return null;
        }
    }

    private static void writeFile(String string) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter((OutputStream)new FileOutputStream("output.txt"), "ascii"));
            bufferedWriter.write(string);
            bufferedWriter.close();
        }
        catch (IOException var1_2) {
            // empty catch block
        }
    }

    public static void main(String[] arrstring) {
        String string = Homework2.readFile();
        switch (softwareType) {
            case FREEWARE: 
            case OPENSOURCE: {
                Homework2.writeFile(string.toUpperCase());
                break;
            }
            case SHAREWARE: {
                Homework2.writeFile("Please pay for the program");
            }
        }
    }

    public static enum PT {
        FREEWARE(0),
        SHAREWARE(1),
        OPENSOURCE(2);
        
        private final int stat;

        private PT(int n2) {
            this.stat = n2;
        }

        public int getCode() {
            return this.stat;
        }
    }

}

