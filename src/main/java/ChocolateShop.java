public class ChocolateShop {
    public Integer run(Integer pocketCash, Integer chocolatePrice, Integer numberOfWrappersRequired) {
        if (pocketCash == 0 && chocolatePrice != 0) {
            return pocketCash / chocolatePrice;
        }
        return Integer.MAX_VALUE;
    }
}
