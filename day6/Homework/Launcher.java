import java.util.*;
import java.io.*;

public class Launcher {
    public static void main(String[] args) throws IOException {
        String[] languages = {"en", "eo", "es"};
        Reader book = new Reader("input.txt");
        String[] allText = book.read();
        int from = -1;
        int to = -1;
        for (int i = 0; i < languages.length; i++) {
            if (allText[0].equals(languages[i])) {
                from = i;
            }
            if (allText[1].equals(languages[i])) {
                to = i;
            }
        }
        Translator trans = new Translator(from, to);
        for (int i = 2; i < book.cnt; i++) {
            allText[i] = trans.translate(allText[i]);
        }
        
        Writer wr = new Writer("output.txt");
        wr.write(allText, book.cnt);
    }
}

class Reader {
    String inFileName = "";
    int cnt = 2;

    public Reader(String name) {
        inFileName = name;
    }
    
    public String[] read() throws IOException {
        File input = new File(inFileName);
        Scanner in = new Scanner(new FileReader(input));
        String[] material = new String[25];
        material[0] = in.next();
        material[1] = in.next();
        String s = in.nextLine(); //TODO: Check
        while (in.hasNextLine()) {
            material[cnt] = in.nextLine();
            cnt++;
        }
        return material;
    }
}

class Writer {
    String outFileName = "";
 
    public Writer(String name) {
        outFileName = name;
    }

    public void write(String[] sentence, int len) throws IOException {
        File output = new File(outFileName);
        PrintWriter out = new PrintWriter(new FileWriter(output));
        for (int i = 2; i < len; i++) {
            out.write(sentence[i] + "\n");
        }
        out.close();
    }
}

class Translator {
    int fromLang;
    int toLang;
    
    public Translator(int from, int to) {
        fromLang = from;
        toLang = to;
    }

    public String translate(String s) {
        String[][] dict = {
            {"tiger", "tigro", "tigre"},
            {"in", "en", "en"},
            {"the", "la", "la"},
            {"house", "domo", "casa"},
            {"I", "Mi", "Me" },
            {"want","volas", "quiero" },
            {"to", "al", "a"},
            {"sea", "maro", "mar"},
            {"you", "vi", "tu"},
            {"old", "malnova", "antiguo" }
        };

        String[] splited = s.split(" ");
        int len = splited.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < dict.length; j++) {
                if (splited[i].equals(dict[j][fromLang])) {
                    splited[i] = dict[j][toLang];
                }
            }
        }
        String mid = splited[len - 1];
        String pars1 = "";
        String pars2 = "";
        for (int i = 0; i < mid.length(); i++) {
            if (mid.charAt(i) > 96 && mid.charAt(i) < 123 ||
                    mid.charAt(i) > 64 && mid.charAt(i) < 91)
                pars1 += mid.charAt(i);
            else 
                pars2 += mid.charAt(i);

        }
        for (int i = 0; i < dict.length; i++)
            if (pars1.equals(dict[i][fromLang]))
                splited[len - 1] = dict[i][toLang] + pars2;
        String answer = "";
        for (int i = 0; i < splited.length; i++)
            answer += splited[i] + " ";
        return answer;
    }
}
