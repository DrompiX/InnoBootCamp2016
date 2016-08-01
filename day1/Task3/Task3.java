import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        menu_show();
        int n;
        System.out.print("Reading of operation : ");
        n = inp.nextInt();
        System.out.print("Reading of two values : ");
        float a, b;
        a = inp.nextFloat();
        b = inp.nextFloat();
        float res = 0;
        switch(n) {
            case 1 :
                res = addition(a, b);
                break;
            case 2:
                res = subtraction(a, b);
                break;
            case 3:
                res = multiplication(a, b);
                break;
            case 4:
                res = division(a, b);
                break;
        }
        System.out.println("Result : " + res);
    }

    static void menu_show() {
        System.out.println("Hello, choose operation number: ");
        System.out.println("1) Addition (+)");
        System.out.println("2) Subtraction (-)");
        System.out.println("3) Multiplication (*)");
        System.out.println("4) Division (/)");
    }

    static float addition(float a, float b) {
        return a + b;       
    }
    static float subtraction(float a, float b) {
        return a - b;   
    }
    static float multiplication(float a, float b) {
        return a * b;   
    }
    static float division(float a, float b) {
        return a / b;   
    }
}

