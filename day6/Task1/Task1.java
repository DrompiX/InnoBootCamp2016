import java.util.*;
import java.io.*;

class Task1 {
    
}

public final class Logger {
    private  static Logger logInstance = new Logger();
    
    public static Logger getLogInstance() {
        return logInstance;
    }

    private void logError(String s) {
        System.out.println(s);
    }
    
    private void logWarning(String s) {
        System.out.println(s);
    }

    public void setLogError() {
    
    }
}
