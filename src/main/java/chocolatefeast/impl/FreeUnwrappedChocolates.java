package chocolatefeast.impl;

import chocolatefeast.Policy;
import chocolatefeast.factory.ChocolateFactory;
import chocolatefeast.model.Chocolate;
import chocolatefeast.model.ChocolateState;
import chocolatefeast.model.ChocolateTransaction;
import chocolatefeast.model.ChocolateType;

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
