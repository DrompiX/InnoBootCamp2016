import java.util.*;

public class GoldSmith {
    List<Diamond> diamondsToProcess = new ArrayList<Diamond>();
    Queue<Diamond> q = new LinkedList<Diamond>();
    String[] states = {"faceted", "in a ring"};

    public void consume(Diamond newOne) {
         diamondsToProcess.add(newOne);
    }

    public void process() {
        for (int i = 0; i < diamondsToProcess.size(); i++) {
            diamondsToProcess.get(i).changeState(states[(int)(Math.random() * 2)]);       
            q.add(diamondsToProcess.get(i));
        }
    }

    public void provide(Rich kate) {
        if (!q.isEmpty()) {
            kate.consume(q.poll());
        }
    }

    public void showState(int currentDiamond) {
        System.out.println("The state of " + currentDiamond + " diamond is : " + 
                diamondsToProcess.get(currentDiamond - 1).getState());
    }
}
