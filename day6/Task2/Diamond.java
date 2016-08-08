public class Diamond {
    private String state = "";
    
    public Diamond() {
        this.state = "raw";
    }

    public void changeState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
}
