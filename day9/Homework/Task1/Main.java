import java.io.*; 

public class Pack implements Serializable { 
    public static void main(String[] arguments) throws IOException { 
        FileInputStream fis = new FileInputStream("input.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Pack p1 = (Pack)ois.readObject();
        ois.close();
    }
}
