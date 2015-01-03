package chocolateshop.impl;

import chocolateshop.ChocolateShop;
import chocolateshop.InvalidInput;
import chocolateshop.builder.ChocolateTransactionBuilder;
import chocolateshop.model.Chocolate;
import chocolateshop.model.ChocolateTransaction;
import chocolateshop.model.ChocolateType;

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