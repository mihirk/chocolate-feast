package chocolateshop;

import chocolateshop.model.ChocolateTransaction;

public interface Policy {
    public void apply(ChocolateTransaction chocolateTransaction) throws InvalidInput;
}
