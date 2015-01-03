package chocolatefeast.impl;

import chocolatefeast.Policy;
import chocolatefeast.model.ChocolateTransaction;
import chocolatefeast.model.ChocolateType;

public class NewPolicy implements Policy {
    private final ChocolateType chocolateType;

    public NewPolicy(ChocolateType chocolateType) {
        this.chocolateType = chocolateType;
    }

    @Override
    public void apply(ChocolateTransaction chocolateTransaction) {
        return;
    }
}
