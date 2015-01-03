package chocolatefeast.impl;

import chocolatefeast.ChocolateShop;
import chocolatefeast.InvalidInput;
import chocolatefeast.builder.ChocolateTransactionBuilder;
import chocolatefeast.model.Chocolate;
import chocolatefeast.model.ChocolateTransaction;
import chocolatefeast.model.ChocolateType;

import java.util.List;

public class OldChocolateShopImpl extends ChocolateShop {
    public OldChocolateShopImpl(Integer chocolatePrice, Integer wrappersNeeded) {
        super(chocolatePrice, wrappersNeeded);
        this.policies.add(new GeneralPolicy(chocolatePrice));
        this.policies.add(new FreeChocolatesOnWrappers(wrappersNeeded));
    }

    @Override
    public List<Chocolate> transact(Integer pocketCash, ChocolateType chocolateType) throws InvalidInput {
        ChocolateTransaction chocolateTransaction = new ChocolateTransactionBuilder().withPocketCash(pocketCash).build();
        chocolateTransaction = applyPolicies(chocolateTransaction);
        return chocolateTransaction.getChocolates();
    }
}