public static enum Homework2.PT {
    FREEWARE(0),
    SHAREWARE(1),
    OPENSOURCE(2);
    
    private final int stat;

    private Homework2.PT(int n2) {
        this.stat = n2;
    }

    public int getCode() {
        return this.stat;
    }
}
