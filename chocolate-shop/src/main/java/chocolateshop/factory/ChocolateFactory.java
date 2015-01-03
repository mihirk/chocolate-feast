package chocolateshop.factory;

import chocolateshop.model.Chocolate;
import chocolateshop.model.ChocolateState;
import chocolateshop.model.ChocolateType;

import java.util.ArrayList;
import java.util.List;

public class ChocolateFactory {

    public static List<Chocolate> getChocolates(Integer count, ChocolateType chocolateType, ChocolateState chocolateState) {
        List<Chocolate> chocolates = new ArrayList<Chocolate>();
        if (chocolateType == null) return chocolates;
        for (int i = 0; i < count; i++) {
            chocolates.add(new Chocolate(chocolateType, chocolateState, 0));
        }
        return chocolates;
    }

    public static List<Chocolate> getChocolates(Integer count, Integer chocolatePrice) {
        List<Chocolate> chocolates = new ArrayList<Chocolate>();
        for (int i = 0; i < count; i++) {
            chocolates.add(new Chocolate(ChocolateState.WRAPPED, chocolatePrice));
        }
        return chocolates;
    }

    public static List<Chocolate> getChocolates(Integer count) {
        return getChocolates(count, 0);
    }

}
