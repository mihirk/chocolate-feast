package chocolatefeast;

import chocolatefeast.model.ChocolateTransaction;

public interface Policy {
    public void apply(ChocolateTransaction chocolateTransaction) throws InvalidInput;
}
