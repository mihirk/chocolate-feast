package chocolatefeast;

import chocolatefeast.model.ChocolateTransaction;
import chocolatefeast.model.ChocolateType;

public interface ChocolateShop {
    public Integer run(Integer pocketCash, Integer chocolatePrice, Integer numberOfWrappersRequired);

    public ChocolateTransaction run(Integer pocketCash, ChocolateType chocolateType);
}
