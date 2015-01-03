package chocolatefeast;

import chocolatefeast.model.Chocolate;
import chocolatefeast.model.ChocolateTransaction;
import chocolatefeast.model.ChocolateType;

import java.util.ArrayList;
import java.util.List;

public abstract class ChocolateShop {
    protected Integer chocolatePrice;
    protected Integer wrappersNeeded;
    protected List<Policy> policies;

    public ChocolateShop(Integer chocolatePrice, Integer wrappersNeeded) {
        this.chocolatePrice = chocolatePrice;
        this.wrappersNeeded = wrappersNeeded;
        this.policies = new ArrayList<Policy>();
    }

    public abstract List<Chocolate> transact(Integer pocketCash, ChocolateType chocolateType) throws InvalidInput;

    protected ChocolateTransaction applyPolicies(ChocolateTransaction chocolateTransaction) throws InvalidInput {
        for (Policy policy : policies) {
            policy.apply(chocolateTransaction);
        }
        return chocolateTransaction;
    }
}
