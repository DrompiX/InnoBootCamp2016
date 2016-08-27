import java.util.*;
import java.io.*;

/**
 * @author Dima Turenko 13/08/2016
 * */
class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        int[][] arr = new int[5][5]; //our maze will be stored here
        int strStart = 0; //string of start point 
        int colStart = 0; //column of start point
        for (int i = 0; i < 5; i++) { //reading of array and searching for Start('S')
            String s = in.nextLine(); 
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (int)(s.charAt(j) - '0'); //F = 22 , S = 35
                if (s.charAt(j) == 'S') {
                    strStart = i;
                    colStart = j;
                }
            }
        
        solve(arr, strStart, colStart, out); //solving of the problem
        out.close(); 
    }

    /**
     * In this menthod, that soving the problem, we try to move in free cells if it possible,
     * and if we found a leaf, we check is it a Finish, if not come back to the previous 
     * cell with deleting of the leaf.
     *
     * @param arr - array that contains our maze
     * @param strStart - string of our start point
     * @param colStart - column of our start point
     * @param out - output
     * */
    public static void solve(int[][] arr, int strStart, int colStart, PrintWriter out) {
        Stack<Pair> st = new Stack<Pair>();  //Cells to visit
        st.push(new Pair(strStart, colStart));
        ArrayList<Pair> list = new ArrayList<Pair>(); //there will be contained our way from S to F, if it possible
        list.add(new Pair(strStart, colStart)); 
        char[] strings = {'A', 'B', 'C', 'D', 'E'}; //names of our strings

        while (!st.empty()) { //while the stack isn't empty we try to move to the cells
            int len = list.size(); 
            int fi = st.peek().first;
            int se = st.peek().second;

            //In this IF ELSE we try to move up in maze
            if (fi - 1 >= 0 && (arr[fi - 1][se] == 0 || arr[fi - 1][se] == 22)) {
                if (st.size() > 1) {
                    if (fi - 1 != list.get(len - 2).first) { //checking if we visited {fi - 1, se} cell
                        st.push(new Pair(fi - 1, se)); //if we can visit it, we put it in the stack
                        list.add(new Pair(fi - 1, se)); //and list
                        continue;
                    }
                } else { //if 1 element in the stack, we put new without checking 
                    st.push(new Pair(fi - 1, se)); 
                    list.add(new Pair(fi - 1, se));
                    continue;
                }
            }

            //In this IF ELSE we try to move to the right in maze
            if (se + 1 < 5 && (arr[fi][se + 1] == 0 || arr[fi][se + 1] == 22)) {
                if (st.size() > 1) {
                    if (se + 1 != list.get(len - 2).second) { //checking if we visited {fi, se + 1} cell
                        st.push(new Pair(fi, se + 1)); //if we can visit it, we put it in the stack
                        list.add(new Pair(fi, se + 1)); //and list
                        continue; 
                    }
                } else { //if 1 element in the stack, we put new without checking
                    st.push(new Pair(fi, se + 1)); 
                    list.add(new Pair(fi, se + 1));
                    continue;
                }
            }

            //In this IF ELSE we try to move down in maze
            if (fi + 1 < 5 && (arr[fi + 1][se] == 0 || arr[fi + 1][se] == 22)) {
                if (st.size() > 1) {
                    if (fi + 1 != list.get(len - 2).first) { //checking if we visited {fi + 1, se} cell
                        st.push(new Pair(fi + 1, se)); //if we can visit it, we put it in the stack
                        list.add(new Pair(fi + 1, se)); //and list
                        continue;
                    }
                } else {
                    st.push(new Pair(fi + 1, se)); 
                    list.add(new Pair(fi + 1, se));
                    continue;
                }
            }

            //In this IF ELSE we try to move to the left in maze
            if (se - 1 >= 0 && (arr[fi][se - 1] == 0 || arr[fi][se - 1] == 22)) {
                if (st.size() > 1) {
                    if (se - 1!= list.get(len - 2).second) { //checking if we visited {fi, se - 1} cell
                        st.push(new Pair(fi, se - 1)); //if we can visit it, we put it in the stack
                        list.add(new Pair(fi, se - 1)); //and list
                        continue;
                    }
                } else {
                    st.push(new Pair(fi, se - 1)); 
                    list.add(new Pair(fi, se - 1));
                    continue;
                }
            }
            
            if (arr[fi][se] == (int)('F' - '0')) { //'F' - '0' because on reading stage we put
                for (int i = 0; i < list.size(); i++) { //in array symbol - '0'
                    out.write(strings[list.get(i).first]); //replacing string number with letter
                    out.write(String.valueOf(list.get(i).second + 1)); //column number
                    out.write(" ");
                }
                return;
            } else {
                arr[fi][se] = 1; //make a wall in this place because there were leaf
                list.remove((int)(list.size() - 1)); //remove last visited elem
                st.pop(); 
            }
        }
        out.write("NO WAY\n");
    }
}

class Pair { //pair of two int elements
    public int first;
    public int second;

    public Pair(int x, int y) {
        first = x;
        second = y;
    }
}
