package chocolatefeast.impl;

import chocolatefeast.ChocolateShop;
import chocolatefeast.model.ChocolateTransaction;
import chocolatefeast.model.ChocolateType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChocolateShopImplTest {
    @Test
    public void shouldReturnAFreeSugarFreeChocolateWithAMilk() throws Exception {
        ChocolateShop chocolateShop = new ChocolateShopImpl(5, 20);
        ChocolateTransaction chocolateTransaction = chocolateShop.run(5, ChocolateType.MILK);
        assertEquals(2, chocolateTransaction.getChocolates().size());
    }
}