package chocolateshop.impl;

import chocolateshop.Policy;
import chocolateshop.factory.ChocolateFactory;
import chocolateshop.model.Chocolate;
import chocolateshop.model.ChocolateState;
import chocolateshop.model.ChocolateTransaction;
import chocolateshop.model.ChocolateType;

import java.util.HashMap;
import java.util.List;

public class FreeUnwrappedChocolates implements Policy {
    private final ChocolateType chocolateType;
    private final HashMap<ChocolateType, ChocolateType> rules = new HashMap<ChocolateType, ChocolateType>() {{
        put(ChocolateType.MILK, ChocolateType.SUGARFREE);
        put(ChocolateType.WHITE, ChocolateType.SUGARFREE);
        put(ChocolateType.SUGARFREE, ChocolateType.DARK);
        put(ChocolateType.DARK, null);
    }};

    public FreeUnwrappedChocolates(ChocolateType chocolateType) {
        this.chocolateType = chocolateType;
    }

    @Override
    public void apply(ChocolateTransaction chocolateTransaction) {
        chocolateTransaction.assignChocolateType(chocolateType);
        List<Chocolate> freeChocolates = chocolateTransaction.getFreeChocolates();
        List<Chocolate> freeUnwrappedChocolates = ChocolateFactory.getChocolates(freeChocolates.size(), rules.get(chocolateType), ChocolateState.UNWRAPPED);
        chocolateTransaction.addChocolates(freeUnwrappedChocolates);
    }
}
