package goodbrother.model;

import chocolateshop.InvalidInput;
import chocolateshop.model.ChocolateType;

public class Brother {
    private Integer pocketCash;
    private ChocolateType chocolateType;

    public Brother(Integer pocketCash, ChocolateType chocolateType) {
        this.pocketCash = pocketCash;
        this.chocolateType = chocolateType;
    }

    public Integer getPocketCash() {
        return pocketCash;
    }

    public ChocolateType getChocolateType() {
        return chocolateType;
    }

    public void spend(Integer moneySpent) throws InvalidInput {
        this.pocketCash -= moneySpent;
    }

    public boolean shouldBuyChocolatesForSister(Sister sister, Integer chocolatePrice) {
        return sister.getChocolateTypesPreferred().contains(chocolateType) && (chocolatePrice * sister.getChocolateQuantity() <= pocketCash);
    }
}
