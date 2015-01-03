import chocolateshop.impl.ChocolateShopImpl;
import chocolateshop.model.Chocolate;
import chocolateshop.model.ChocolateState;
import chocolateshop.model.ChocolateType;
import model.Brother;
import model.Sister;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static chocolateshop.impl.TestUtils.countOfChocolatesOfState;
import static chocolateshop.impl.TestUtils.countOfChocolatesOfType;
import static org.junit.Assert.assertEquals;

public class ChocolateShopVisitTest {

    @Test
    public void shouldBuyForSisterIfTypeOfChocolateMatches() throws Exception {
        Brother brother = new Brother(12, ChocolateType.MILK);
        Sister sister = new Sister(1, Arrays.asList(ChocolateType.MILK, ChocolateType.WHITE));
        ChocolateShopImpl chocolateShop = new ChocolateShopImpl(2, 5);
        List<Chocolate> chocolates = ChocolateShopVisit.getChocolates(brother, sister, chocolateShop);
        assertEquals(7, chocolates.size());

        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.DARK));
        assertEquals(6, countOfChocolatesOfType(chocolates, ChocolateType.MILK));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.WHITE));
        assertEquals(1, countOfChocolatesOfType(chocolates, ChocolateType.SUGARFREE));

        assertEquals(6, countOfChocolatesOfState(chocolates, ChocolateState.WRAPPED));
        assertEquals(1, countOfChocolatesOfState(chocolates, ChocolateState.UNWRAPPED));
    }

    @Test
    public void shouldNotBuyForSisterIfTypeOfChocolateNotMatches() throws Exception {
        Brother brother = new Brother(12, ChocolateType.DARK);
        Sister sister = new Sister(1, Arrays.asList(ChocolateType.MILK, ChocolateType.WHITE));
        ChocolateShopImpl chocolateShop = new ChocolateShopImpl(4, 4);
        List<Chocolate> chocolates = ChocolateShopVisit.getChocolates(brother, sister, chocolateShop);
        assertEquals(3, chocolates.size());

        assertEquals(3, countOfChocolatesOfType(chocolates, ChocolateType.DARK));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.MILK));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.WHITE));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.SUGARFREE));

        assertEquals(3, countOfChocolatesOfState(chocolates, ChocolateState.WRAPPED));
        assertEquals(0, countOfChocolatesOfState(chocolates, ChocolateState.UNWRAPPED));
    }


    @Test
    public void shouldNotBuyForSisterIfTypeOfChocolateDoesNotMatche() throws Exception {
        Brother brother = new Brother(6, ChocolateType.SUGARFREE);
        Sister sister = new Sister(1, Arrays.asList(ChocolateType.MILK, ChocolateType.WHITE));
        ChocolateShopImpl chocolateShop = new ChocolateShopImpl(2, 2);
        List<Chocolate> chocolates = ChocolateShopVisit.getChocolates(brother, sister, chocolateShop);
        assertEquals(7, chocolates.size());

        assertEquals(2, countOfChocolatesOfType(chocolates, ChocolateType.DARK));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.MILK));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.WHITE));
        assertEquals(5, countOfChocolatesOfType(chocolates, ChocolateType.SUGARFREE));

        assertEquals(5, countOfChocolatesOfState(chocolates, ChocolateState.WRAPPED));
        assertEquals(2, countOfChocolatesOfState(chocolates, ChocolateState.UNWRAPPED));
    }


    @Test
    public void shouldBuyForSisterBeforeHimself() throws Exception {
        Brother brother = new Brother(6, ChocolateType.WHITE);
        Sister sister = new Sister(1, Arrays.asList(ChocolateType.MILK, ChocolateType.WHITE));
        ChocolateShopImpl chocolateShop = new ChocolateShopImpl(2, 2);
        List<Chocolate> chocolates = ChocolateShopVisit.getChocolates(brother, sister, chocolateShop);
        assertEquals(4, chocolates.size());

        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.DARK));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.MILK));
        assertEquals(3, countOfChocolatesOfType(chocolates, ChocolateType.WHITE));
        assertEquals(1, countOfChocolatesOfType(chocolates, ChocolateType.SUGARFREE));

        assertEquals(3, countOfChocolatesOfState(chocolates, ChocolateState.WRAPPED));
        assertEquals(1, countOfChocolatesOfState(chocolates, ChocolateState.UNWRAPPED));
    }

    @Test
    public void shouldNotBuyForSisterIfMoneyNotEnough() throws Exception {
        Brother brother = new Brother(6, ChocolateType.WHITE);
        Sister sister = new Sister(10, Arrays.asList(ChocolateType.MILK, ChocolateType.WHITE));
        ChocolateShopImpl chocolateShop = new ChocolateShopImpl(2, 2);
        List<Chocolate> chocolates = ChocolateShopVisit.getChocolates(brother, sister, chocolateShop);
        assertEquals(7, chocolates.size());

        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.DARK));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.MILK));
        assertEquals(5, countOfChocolatesOfType(chocolates, ChocolateType.WHITE));
        assertEquals(2, countOfChocolatesOfType(chocolates, ChocolateType.SUGARFREE));

        assertEquals(5, countOfChocolatesOfState(chocolates, ChocolateState.WRAPPED));
        assertEquals(2, countOfChocolatesOfState(chocolates, ChocolateState.UNWRAPPED));
    }

    @Test
    public void returnNoChocolatesIfMoneyIsZeroOrLesserThanChocolatePrice() throws Exception {
        Brother brother = new Brother(0, ChocolateType.WHITE);
        Sister sister = new Sister(10, Arrays.asList(ChocolateType.MILK, ChocolateType.WHITE));
        ChocolateShopImpl chocolateShop = new ChocolateShopImpl(2, 2);
        List<Chocolate> chocolates = ChocolateShopVisit.getChocolates(brother, sister, chocolateShop);
        assertEquals(0, chocolates.size());

        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.DARK));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.MILK));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.WHITE));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.SUGARFREE));

        assertEquals(0, countOfChocolatesOfState(chocolates, ChocolateState.WRAPPED));
        assertEquals(0, countOfChocolatesOfState(chocolates, ChocolateState.UNWRAPPED));

        brother = new Brother(1, ChocolateType.WHITE);
        sister = new Sister(10, Arrays.asList(ChocolateType.MILK, ChocolateType.WHITE));
        chocolateShop = new ChocolateShopImpl(2, 2);
        chocolates = ChocolateShopVisit.getChocolates(brother, sister, chocolateShop);
        assertEquals(0, chocolates.size());

        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.DARK));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.MILK));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.WHITE));
        assertEquals(0, countOfChocolatesOfType(chocolates, ChocolateType.SUGARFREE));

        assertEquals(0, countOfChocolatesOfState(chocolates, ChocolateState.WRAPPED));
        assertEquals(0, countOfChocolatesOfState(chocolates, ChocolateState.UNWRAPPED));
    }
}