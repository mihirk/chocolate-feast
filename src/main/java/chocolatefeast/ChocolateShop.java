package chocolatefeast;

import chocolatefeast.model.Chocolate;
import chocolatefeast.model.ChocolateTransaction;
import chocolatefeast.model.ChocolateType;

import java.util.List;

public interface ChocolateShop {
    public Integer run(Integer pocketCash, Integer chocolatePrice, Integer numberOfWrappersRequired) throws InvalidInput;

    public List<Chocolate> run(Integer pocketCash, ChocolateType chocolateType) throws InvalidInput;
}
