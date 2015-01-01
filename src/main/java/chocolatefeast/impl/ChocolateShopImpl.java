package chocolatefeast.impl;

import chocolatefeast.ChocolateShop;
import chocolatefeast.model.ChocolateTransaction;
import chocolatefeast.model.ChocolateType;

public class ChocolateShopImpl implements ChocolateShop {
    private int chocolatePrice;
    private int wrappersNeeded;

    public ChocolateShopImpl(int chocolatePrice, int wrappersNeeded) {
        this.chocolatePrice = chocolatePrice;
        this.wrappersNeeded = wrappersNeeded;
    }

    public Integer run(Integer pocketCash, Integer chocolatePrice, Integer numberOfWrappersRequired) {
        OldChocolateShop oldChocolateShop = new OldChocolateShop(chocolatePrice, numberOfWrappersRequired);
        return oldChocolateShop.run(pocketCash);
    }

    @Override
    public ChocolateTransaction run(Integer pocketCash, ChocolateType chocolateType) {
        return null;
    }
}
