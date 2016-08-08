import java.util.*;

public class Rich {
    List<Diamond> diamondsList = new ArrayList<Diamond>();

    public void consume(Diamond newOne) {
        diamondsList.add(newOne);
    }

    public void showState(int currentDiamond) {
        System.out.println("The state of " + currentDiamond + " diamond is : " + 
                diamondsList.get(currentDiamond).getState());
    }
}
