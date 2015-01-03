package chocolateshop.impl;

import chocolateshop.InvalidInput;
import chocolateshop.Policy;
import chocolateshop.factory.ChocolateFactory;
import chocolateshop.model.ChocolateTransaction;

public class GeneralPolicy implements Policy {
    private final Integer chocolatePrice;

    public GeneralPolicy(Integer chocolatePrice) {
        this.chocolatePrice = chocolatePrice;
    }

    @Override
    public void apply(ChocolateTransaction chocolateTransaction) throws InvalidInput {
        Integer pocketCash = chocolateTransaction.getPocketCash();
        if (pocketCash == 0) {
            return;
        } else if (chocolatePrice == 0) {
            throw new InvalidInput("Infinite Output");
        }
        Integer numberOfChocolates = pocketCash / chocolatePrice;
        chocolateTransaction.setChocolates(ChocolateFactory.getChocolates(numberOfChocolates, chocolatePrice));
    }
}
