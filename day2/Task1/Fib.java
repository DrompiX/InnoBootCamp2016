class Fib {
    public static void main(String[] args) {
        long a = 1, b = 1, mid = 0, cnt = 2;
        while (true) {
            if ((byte)(a + b) > 0) {
                mid =(byte)(a + b);
                a = b; b = mid;
                cnt++;
            } else break;
        }
        System.out.println("byte: " + cnt);
        
        while (true) {
            if ((short)(a + b) > 0) {
                mid =(short)(a + b);
                a = b; b = mid;
                cnt++;
            } else break;
        }
        System.out.println("short: " + cnt);
        
        while (true) {
            if ((int)(a + b) > 0) {
                mid =(int)(a + b);
                a = b; b = mid;
                cnt++;
            } else break;
        }
        System.out.println("int: " + cnt);

        while (true) {
            if ((long)(a + b) > 0) {
                mid =(long)(a + b);
                a = b; b = mid;
                cnt++;
            } else break;
        }
        System.out.println("long: " + cnt);

    }
}
