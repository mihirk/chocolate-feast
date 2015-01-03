package chocolateshop;

import chocolateshop.model.Chocolate;
import chocolateshop.model.ChocolateTransaction;
import chocolateshop.model.ChocolateType;

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

    public Integer getChocolatePrice() {
        return chocolatePrice;
    }
}
