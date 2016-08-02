class Task3 {
    public static void main(String[] args) {
        int str = 10;
        int[][] a = new int[str][];
        for (int i = 0; i < str; i++) 
            a[i] = new int[i + 1];
        
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j == 0 || j == a[i].length - 1) {
                    a[i][j] = 1;
                    continue;
                }
                if (i != 0 && i != 1) {
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];   
                }
            }
        }
        int chng = str;
        for (int i = 0; i < str; i++) {
            for (int k = 0; k < chng; k++)
                    System.out.print(" ");
            chng--;
            for (int j = 0; j < a[i].length; j++) { 
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
