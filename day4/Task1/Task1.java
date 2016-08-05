import java.util.*;
import java.io.*;

class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }
}

class Matrix {
        public int strings = 0;
        public int columns = 0;
        public int[][] matrix;

        public Matrix(int a, int b) {
            strings = a;
            columns = b;
            matrix = new int[a][b];
        }

        public void sumOfMatrix(int[][] a) {
            for (int i = 0; i < strings; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] += a[i][j];
                }
            }
        }

        public void scalarMultOfMatrix(int num) {
            for (int i = 0; i < strings; i++)
                for (int j = 0; j < columns; j++)
                    matrix[i][j] *= num;
        }
        
        public void read(Scanner in) {
            System.out.print("Reading of strings and columns numbers: ");
            strings = in.nextInt();
            columns = in.nextInt();

            System.out.println("Reading of first matrix: "); 
            for (int i = 0; i < strings; i++)
                for (int j = 0; j < columns; j++)
                    matrix[i][j] = in.nextInt();
        }    
 
        public void print() {
            for (int i = 0; i < strings; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
}



/*Scanner in = new Scanner(new FileReader("input.txt"));
PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
out.close();*/

