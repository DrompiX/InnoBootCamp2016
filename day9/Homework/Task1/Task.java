import java.io.*; 
import java.util.*;
import java.nio.*;

public class Task{ 
    public static void main(String[] arguments) throws IOException { 
        //Scanner in = new Scanner(new FileReader("input.bin"));
        /*File file = new File("input.bin");
        InputStream stream = new FileInputStream(file);*/
        FileInputStream fin = new FileInputStream("input.bin");
        DataInputStream in = new DataInputStream(fin);
        PrintWriter out = new PrintWriter(new File("output.txt"));

        float f = in.readFloat();
        System.out.println(f);

        /*boolean log = true;

            byte[] bytes = new byte[4];
            int bytesRead = stream.read(bytes, 0, 4);
            stream.close();
            int asInt = ((bytes[0] & 0xFF) << 24) | ((bytes[1] & 0xFF) << 16) 
                        | ((bytes[2] & 0xFF) << 8) | (bytes[3] & 0xFF);
            System.out.println(asInt);
            float asFloat = Float.intBitsToFloat(asInt);
            out.format("%.0f ", asFloat);*/
        in.close();
        out.close();
    }
}

