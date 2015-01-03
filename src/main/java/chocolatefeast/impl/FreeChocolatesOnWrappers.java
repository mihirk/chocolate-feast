package chocolatefeast.impl;

import chocolatefeast.InvalidInput;
import chocolatefeast.Policy;
import chocolatefeast.factory.ChocolateFactory;
import chocolatefeast.model.Chocolate;
import chocolatefeast.model.ChocolateTransaction;

import java.util.List;

public class FreeChocolatesOnWrappers implements Policy {
    private final Integer wrappersNeeded;

    public FreeChocolatesOnWrappers(Integer wrappersNeeded) {
        this.wrappersNeeded = wrappersNeeded;
    }

    @Override
    public void apply(ChocolateTransaction chocolateTransaction) throws InvalidInput {
        if (wrappersNeeded == 0) {
            throw new InvalidInput("Infinite output");
        }
        chocolateTransaction.setChocolates(processPolicy(chocolateTransaction.getChocolates(), chocolateTransaction.getChocolates()));
    }

    private List<Chocolate> processPolicy(List<Chocolate> chocolatesInPossession, List<Chocolate> unprocessedChocolates) {
        if (unprocessedChocolates.size() < wrappersNeeded) {
            return chocolatesInPossession;
        }
        Integer extraChocolateCount = unprocessedChocolates.size() / wrappersNeeded;
        Integer remainingWrappers = unprocessedChocolates.size() % wrappersNeeded;
        unprocessedChocolates = ChocolateFactory.getChocolates(remainingWrappers + extraChocolateCount);
        chocolatesInPossession.addAll(ChocolateFactory.getChocolates(extraChocolateCount));
        return processPolicy(chocolatesInPossession, unprocessedChocolates);
    }
}
