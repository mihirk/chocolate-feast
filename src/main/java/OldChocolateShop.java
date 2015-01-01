public class OldChocolateShop {

    public Integer run(Integer pocketCash, Integer chocolatePrice, Integer numberOfWrappersRequired) {
        if (chocolatePrice == 0 || (numberOfWrappersRequired == 0 && pocketCash > 0)) {
            return Integer.MAX_VALUE;
        }
        return calculateNumberOfChocolates(roundUpCash(pocketCash, chocolatePrice), chocolatePrice, numberOfWrappersRequired, 0);
    }

    private Integer calculateNumberOfChocolates(Double pocketCash, Integer chocolatePrice, Integer numberOfWrappersRequired, Integer numberOfChocolatesAcquired) {
        int numberOfChocolatesBought = (pocketCash.intValue() / chocolatePrice);
        Double leftOverCash = convertWrappersToCash(pocketCash, chocolatePrice, numberOfWrappersRequired, numberOfChocolatesBought);
        numberOfChocolatesAcquired += numberOfChocolatesBought;
        if (leftOverCash < chocolatePrice || leftOverCash.isNaN()) {
            return numberOfChocolatesAcquired;
        }
        return calculateNumberOfChocolates(leftOverCash, chocolatePrice, numberOfWrappersRequired, numberOfChocolatesAcquired);
    }

    private Double convertWrappersToCash(Double pocketCash, Integer chocolatePrice, Integer numberOfWrappersRequired, double numberOfChocolatesBought) {
        Double leftOverCash = pocketCash % chocolatePrice;
        leftOverCash += (numberOfChocolatesBought / numberOfWrappersRequired) * chocolatePrice;
        return leftOverCash;
    }

    private Double roundUpCash(Integer pocketCash, Integer chocolatePrice) {
        return (double) (pocketCash / chocolatePrice * chocolatePrice);
    }

}
