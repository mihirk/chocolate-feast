package chocolatefeast.builder;

import chocolatefeast.model.ChocolateTransaction;

public class ChocolateTransactionBuilder {

    private final ChocolateTransaction chocolateTransaction;

    public ChocolateTransactionBuilder() {
        chocolateTransaction = new ChocolateTransaction();
    }

    public ChocolateTransactionBuilder withPocketCash(Integer pocketCash) {
        chocolateTransaction.setPocketCash(pocketCash);
        return this;
    }

    public ChocolateTransaction build() {
        return chocolateTransaction;
    }

}
