package chocolatefeast.factory;

import chocolatefeast.model.Chocolate;
import chocolatefeast.model.ChocolateState;
import chocolatefeast.model.ChocolateType;

import java.util.ArrayList;
import java.util.List;

public class ChocolateFactory {
    public static List<Chocolate> getChocolates(Integer count, ChocolateType chocolateType, ChocolateState chocolateState) {
        List<Chocolate> chocolates = new ArrayList<Chocolate>();
        for (int i = 0; i < count; i++) {
            chocolates.add(new Chocolate(chocolateType, chocolateState));
        }
        return chocolates;
    }

    public static List<Chocolate> getChocolates(Integer count) {
        List<Chocolate> chocolates = new ArrayList<Chocolate>();
        for (int i = 0; i < count; i++) {
            chocolates.add(new Chocolate());
        }
        return chocolates;
    }
}
