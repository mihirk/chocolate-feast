package chocolatefeast.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ChocolateTransaction {
    private HashMap<ChocolateType, List<Chocolate>> chocolates;

    public ChocolateTransaction() {
        chocolates = new HashMap<ChocolateType, List<Chocolate>>();
    }

    public HashMap<ChocolateType, List<Chocolate>> getChocolates() {
        return chocolates;
    }

    public void addChocolates(Integer chocolateCount, ChocolateType chocolateType, ChocolateState chocolateState) {
        List<Chocolate> chocolates = new ArrayList<Chocolate>();
        for (int i = 0; i < chocolateCount; i++) {
            chocolates.add(new Chocolate(chocolateType, chocolateState));
        }
        this.chocolates.put(chocolateType, chocolates);
    }
}
