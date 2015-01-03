package chocolateshop.impl;

import chocolateshop.model.Chocolate;
import chocolateshop.model.ChocolateState;
import chocolateshop.model.ChocolateType;

import java.util.List;

public class TestUtils {

    public static int countOfChocolatesOfType(List<Chocolate> chocolates, ChocolateType chocolateType) {
        int count = 0;
        for (Chocolate chocolate : chocolates) {
            if (chocolate.getChocolateType().equals(chocolateType)) {
                count++;
            }
        }
        return count;
    }

    public static int countOfChocolatesOfState(List<Chocolate> chocolates, ChocolateState chocolateState) {
        int count = 0;
        for (Chocolate chocolate : chocolates) {
            if (chocolate.getChocolateState().equals(chocolateState)) {
                count++;
            }
        }
        return count;
    }
}
