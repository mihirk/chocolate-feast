import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ChocolateShopTest {

    private ChocolateShop chocolateShop;

    @Before
    public void setUp() throws Exception {
        chocolateShop = new ChocolateShop();

    }

    @Test
    public void shouldReturnZeroIfCashInPocketIsZero() throws Exception {
        Integer numberOfChocolates = chocolateShop.run(0, 1, 0);
        assertEquals(0, numberOfChocolates.intValue());
    }

    @Test
    public void shouldReturnInfinityIfChocolateIsForFree() throws Exception {
        Integer numberOfChocolates = chocolateShop.run(1, 0, 0);
        assertEquals(Integer.MAX_VALUE, numberOfChocolates.intValue());
    }

    @Test
    public void shouldReturnInfinityIfWrappersNeededIsZero() throws Exception {
        Integer numberOfChocolates = chocolateShop.run(1, 1, 0);
        assertEquals(Integer.MAX_VALUE, numberOfChocolates.intValue());
    }

    @Test
    public void shouldReturnTheInitialNumberOfChocolatesIfWrappersRequiredIsInfinity() throws Exception {
        Integer numberOfChocolates = chocolateShop.run(1, 0, Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, numberOfChocolates.intValue());
    }

    @Test
    public void shouldReturnTheNumberOfChocolates() throws Exception {

    }
}
