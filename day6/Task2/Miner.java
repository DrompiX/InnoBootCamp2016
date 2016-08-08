import java.util.*;

public class Miner {
    List<Diamond> diamondsList = new ArrayList<Diamond>();
    Queue<Diamond> q = new LinkedList<Diamond>();

    public void mine() {
        Diamond current = new Diamond();
        diamondsList.add(current);
        q.add(current);
        //System.out.println("New diamond was added");
    }

    public void provide(GoldSmith bob) {
        if (!q.isEmpty()) {
            bob.consume(q.poll());
        }
    }

    public void showState(int currentDiamond) {
        System.out.println("The state of " + currentDiamond + " diamond is : " + 
                diamondsList.get(currentDiamond - 1).getState());
    }
}
