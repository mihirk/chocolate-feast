package chocolateshop.impl;

import chocolateshop.ChocolateShop;
import chocolateshop.model.Chocolate;
import chocolateshop.model.ChocolateState;
import chocolateshop.model.ChocolateType;
import org.junit.Test;
import java.util.List;

import static chocolateshop.impl.TestUtils.countOfChocolatesOfState;
import static chocolateshop.impl.TestUtils.countOfChocolatesOfType;
import static org.junit.Assert.assertEquals;

public class ChocolateShopImplTest {

    @Test
    public void shouldReturnAFreeUnwrappedSugarFreeChocolateWithAMilkChocolate() throws Exception {
        ChocolateShop chocolateShop = new ChocolateShopImpl(2, 5);
        List<Chocolate> chocolates = chocolateShop.transact(12, ChocolateType.MILK);
        assertEquals(8, chocolates.size());

        int milkChocolates = countOfChocolatesOfType(chocolates, ChocolateType.MILK);
        int sugarFreeChocolates = countOfChocolatesOfType(chocolates, ChocolateType.SUGARFREE);

        assertEquals(1, sugarFreeChocolates);
        assertEquals(7, milkChocolates);
        assertEquals(1, countOfChocolatesOfState(chocolates, ChocolateState.UNWRAPPED));
        assertEquals(7, countOfChocolatesOfState(chocolates, ChocolateState.WRAPPED));
    }


    @Test
    public void shouldNotReturnAnyFreeUnwrappedChocolatesIfNoFreeChocolates() throws Exception {
        ChocolateShop chocolateShop = new ChocolateShopImpl(4, 4);
        List<Chocolate> chocolates = chocolateShop.transact(12, ChocolateType.DARK);
        assertEquals(3, chocolates.size());

        assertEquals(3, countOfChocolatesOfType(chocolates, ChocolateType.DARK));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.MILK));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.WHITE));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.SUGARFREE));

        assertEquals(3, countOfChocolatesOfState(chocolates, ChocolateState.WRAPPED));
        assertEquals(0, countOfChocolatesOfState(chocolates, ChocolateState.UNWRAPPED));
    }

    @Test
    public void shouldReturnDarkFreeUnwrappedWithSugarFree() throws Exception {
        ChocolateShop chocolateShop = new ChocolateShopImpl(2, 2);
        List<Chocolate> chocolates = chocolateShop.transact(6, ChocolateType.SUGARFREE);
        assertEquals(7, chocolates.size());

        assertEquals(2, countOfChocolatesOfType(chocolates, ChocolateType.DARK));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.MILK));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.WHITE));
        assertEquals(5, countOfChocolatesOfType(chocolates, ChocolateType.SUGARFREE));

        assertEquals(5, countOfChocolatesOfState(chocolates, ChocolateState.WRAPPED));
        assertEquals(2, countOfChocolatesOfState(chocolates, ChocolateState.UNWRAPPED));
    }

    @Test
    public void shouldReturnSugarFreeWithWhite() throws Exception {
        ChocolateShop chocolateShop = new ChocolateShopImpl(2, 2);
        List<Chocolate> chocolates = chocolateShop.transact(6, ChocolateType.WHITE);
        assertEquals(7, chocolates.size());

        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.DARK));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.MILK));
        assertEquals(5, countOfChocolatesOfType(chocolates, ChocolateType.WHITE));
        assertEquals(2, countOfChocolatesOfType(chocolates, ChocolateType.SUGARFREE));

        assertEquals(5, countOfChocolatesOfState(chocolates, ChocolateState.WRAPPED));
        assertEquals(2, countOfChocolatesOfState(chocolates, ChocolateState.UNWRAPPED));
    }

    @Test
    public void shouldNotReturnAnyFreeUnwrappedChocolatesWithDark() throws Exception {
        ChocolateShop chocolateShop = new ChocolateShopImpl(4, 3);
        List<Chocolate> chocolates = chocolateShop.transact(12, ChocolateType.DARK);
        assertEquals(4, chocolates.size());

        assertEquals(4, countOfChocolatesOfType(chocolates, ChocolateType.DARK));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.MILK));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.WHITE));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.SUGARFREE));

        assertEquals(4, countOfChocolatesOfState(chocolates, ChocolateState.WRAPPED));
        assertEquals(0, countOfChocolatesOfState(chocolates, ChocolateState.UNWRAPPED));
    }

}