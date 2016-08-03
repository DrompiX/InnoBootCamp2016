import java.util.*;
import java.io.*;

class Etask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Write alphabet: ");
        String s = in.nextLine();
        String[] sch = s.split(" ");
        char[] ch = new char[sch.length];
        for (int i = 0; i < sch.length; i++)
            ch[i] = sch[i].charAt(0);
        System.out.print("Write length: ");
        int len = in.nextInt(); 
        generate(ch, len); 
    }
    
    public static void generate(char[] ch, int len) {
        String ans = "";  
        perm(ch, ans, len);
    }

    public static void perm(char[] ch, String s, int len) {
        if (s.length() == len) {
            System.out.println(s);
            return;
        }
        for (int i = 0; i < ch.length; i++)  
            perm(ch, s + ch[i], len);
    }
}
 
