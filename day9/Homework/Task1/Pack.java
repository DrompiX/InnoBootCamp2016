import java.io.*; 
import java.util.*;

/**
 * 11/08/2016
 * */
public class Pack { 
    public static void main(String[] arguments) throws IOException, Exception { 
        File inp = new File("input.bin"); 
        FileInputStream fis = new FileInputStream(inp);
        PrintWriter out = new PrintWriter("output.txt");
        byte[] buf = new byte[4];
        do {
            fis.read(buf, 0, 4); //reading 4 bytes
            int asInt = ((buf[0] & 0xFF) << 24) //making shifting to glue bytes
                        | ((buf[1] & 0xFF) << 16) 
                        | ((buf[2] & 0xFF) << 8) 
                        | (buf[3] & 0xFF);
            out.print(Math.round(Float.intBitsToFloat(asInt)) + " ");
        } while (fis.available() > 0);
        out.close(); 
    }
}

