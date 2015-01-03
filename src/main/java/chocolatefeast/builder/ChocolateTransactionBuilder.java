package chocolatefeast.builder;

import chocolatefeast.model.Chocolate;
import chocolatefeast.model.ChocolateTransaction;

import java.util.List;

public class ChocolateTransactionBuilder {

    private final ChocolateTransaction chocolateTransaction;

    public ChocolateTransactionBuilder() {
        chocolateTransaction = new ChocolateTransaction();
    }

    public ChocolateTransactionBuilder withPocketCash(Integer pocketCash) {
        chocolateTransaction.setPocketCash(pocketCash);
        return this;
    }

    public ChocolateTransactionBuilder withChocolates(List<Chocolate> chocolates) {
        chocolateTransaction.addChocolates(chocolates);
        return this;
    }

    public ChocolateTransaction build() {
        return chocolateTransaction;
    }

}
