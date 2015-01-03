package goodbrother;

import chocolateshop.ChocolateShop;
import chocolateshop.InvalidInput;
import chocolateshop.model.Chocolate;
import goodbrother.model.Brother;
import goodbrother.model.Sister;

import java.util.ArrayList;
import java.util.List;

public class ChocolateShopVisit {
    public static List<Chocolate> getChocolates(Brother brother, Sister sister, ChocolateShop chocolateShop) throws InvalidInput {
        Integer chocolatePrice = chocolateShop.getChocolatePrice();
        List<Chocolate> chocolatesBought = new ArrayList<Chocolate>();
        if (brother.shouldBuyChocolatesForSister(sister, chocolatePrice)) {
            Integer priceOfChocolatesForSister = chocolatePrice * sister.getChocolateQuantity();
            brother.spend(priceOfChocolatesForSister);
        }
        chocolatesBought.addAll(chocolateShop.transact(brother.getPocketCash(), brother.getChocolateType()));
        return chocolatesBought;
    }
}