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
        Integer numberOfChocolates = chocolateShop.run(0, 0, 0);
        assertEquals((Integer) 0, numberOfChocolates);
    }
}
