import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner in = new Scanner(new FileReader("input.txt"));   
        String[] answers = new String[10];
        for (int i = 0; i < 10; i++) {
            answers[i] = "";
        }

        HashMap <String, Integer> map = new HashMap<String, Integer>();
        while (in.hasNextLine()) {
            String s = in.nextLine();
            s = s.replace(".", " ");
            s = s.replace("-", " ");
            s = s.replace(":", " ");
            s = s.replace("!", " ");
            s = s.replace("[", " ");
            s = s.replace("]", " ");
            s = s.replace("*", " ");
            s = s.replace(";", " ");
            s = s.replace("?", " ");
            s = s.replace("_", " ");
            s = s.replace("+", " ");
            s = s.replaceAll("[\\s]{2,}", " ");
            String[] splited = s.split(" ");
            for (int i = 0; i < splited.length; i++) {
                if (!splited[i].equals(" ")) {
                    if (map.containsKey(splited[i])) {
                        map.put(splited[i], (Integer)(map.get(splited[i]) + 1));
                    } else {
                        map.put(splited[i], (Integer)(1));
                    }
                }
            }
        }

        TreeMap <Integer, String> changerMap = new TreeMap<Integer, String>(Collections.reverseOrder());
        for (Map.Entry entry: map.entrySet()) {
                changerMap.put((Integer)entry.getValue(), (String)entry.getKey());
        }

        int cnt = 0;
        for (Map.Entry entry: changerMap.entrySet()) {
            if (cnt < 10) {
                System.out.println(entry.getValue() + " " + entry.getKey());
                cnt++;
            } else {
                break;
            }
        }
    }
}

