package chocolatefeast.impl;

import chocolatefeast.ChocolateShop;
import chocolatefeast.InvalidInput;
import chocolatefeast.Policy;
import chocolatefeast.builder.ChocolateTransactionBuilder;
import chocolatefeast.model.Chocolate;
import chocolatefeast.model.ChocolateTransaction;
import chocolatefeast.model.ChocolateType;

import java.util.List;

public class ChocolateShopImpl implements ChocolateShop {
    private int chocolatePrice;
    private int wrappersNeeded;

    public ChocolateShopImpl(int chocolatePrice, int wrappersNeeded) {
        this.chocolatePrice = chocolatePrice;
        this.wrappersNeeded = wrappersNeeded;
    }

    public Integer run(Integer pocketCash, Integer chocolatePrice, Integer numberOfWrappersRequired) throws InvalidInput {
        GeneralPolicy generalPolicy = new GeneralPolicy(chocolatePrice);
        FreeChocolatesOnWrappers freeChocolatesOnWrappers = new FreeChocolatesOnWrappers(numberOfWrappersRequired);
        ChocolateTransaction chocolateTransaction = new ChocolateTransactionBuilder().withPocketCash(pocketCash).build();
        chocolateTransaction = applyPolicies(chocolateTransaction, generalPolicy, freeChocolatesOnWrappers);
        return chocolateTransaction.getChocolates().size();
    }

    @Override
    public List<Chocolate> run(Integer pocketCash, ChocolateType chocolateType) throws InvalidInput {
        GeneralPolicy generalPolicy = new GeneralPolicy(chocolatePrice);
        FreeChocolatesOnWrappers freeChocolatesOnWrappers = new FreeChocolatesOnWrappers(wrappersNeeded);
        NewPolicy newPolicy = new NewPolicy(chocolateType);
        ChocolateTransaction chocolateTransaction = new ChocolateTransactionBuilder().withPocketCash(pocketCash).build();
        chocolateTransaction = applyPolicies(chocolateTransaction, generalPolicy, freeChocolatesOnWrappers, newPolicy);
        return chocolateTransaction.getChocolates();
    }

    private ChocolateTransaction applyPolicies(ChocolateTransaction chocolateTransaction, Policy... policies) throws InvalidInput {
        for (Policy policy : policies) {
            policy.apply(chocolateTransaction);
        }
        return chocolateTransaction;
    }
//    Integer chocolatesBought = pocketCash / chocolatePrice;
//        Integer totalChocolates = run(pocketCash, chocolatePrice, wrappersNeeded);
//        Integer freeChocolates = totalChocolates - chocolatesBought;
//        ChocolateTransaction chocolateTransaction = new ChocolateTransaction();
//        chocolateTransaction.addChocolates(totalChocolates, chocolateType, ChocolateState.WRAPPED);
//        if (chocolateType.equals(ChocolateType.MILK)) {
//            chocolateTransaction.addChocolates(freeChocolates, ChocolateType.SUGAR_FREE, ChocolateState.UNWRAPPED);
//        }
}
