import java.util.*;
import java.io.*;

class Application {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Miner ted = new Miner();
        GoldSmith bob = new GoldSmith();
        Rich kate = new Rich();

        System.out.print("How many diamonds miner found? - ");
        int founded = in.nextInt();
        for (int i = 0; i < founded; i++) {
            ted.mine(); //Searching for the diamonds
        }
        //ted.arrToQueue();
        for (int i = 0; i < founded; i++) {
            ted.provide(bob); //Selling diamonds to the jeweler
        }
        for (int i = 0; i < founded; i++) {
            bob.process(); //Processing of the diamonds
        }
        for (int i = 0; i < founded; i++) {
            bob.provide(kate); //Selling diamonds to Kate, who is really rich ;)
        }
        
        System.out.println("\nRich bought " + founded + " diamonds, there are their states :");
        for (int i = 0; i < kate.diamondsList.size(); i++) {
            System.out.println("The state of the " + (i + 1) + " diamond is : " +
                    kate.diamondsList.get(i).getState());
        }

        System.out.println("\nIf you want to know every diamond's state, \nWrite <name of Miner/GS/Rich>.showState(index);");
    }
}
