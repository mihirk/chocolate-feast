//package chocolatefeast.impl;
//
//import chocolatefeast.ChocolateShop;
//import chocolatefeast.model.Chocolate;
//import chocolatefeast.model.ChocolateState;
//import chocolatefeast.model.ChocolateTransaction;
//import chocolatefeast.model.ChocolateType;
//import org.junit.Test;
//
//import java.util.HashMap;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//public class ChocolateShopImplTest {
//    @Test
//    public void shouldReturnAFreeSugarFreeChocolateWithAMilk() throws Exception {
//        ChocolateShop chocolateShop = new ChocolateShopImpl(5, 5);
//        ChocolateTransaction chocolateTransaction = chocolateShop.run(25, ChocolateType.MILK);
//        HashMap<ChocolateType, List<Chocolate>> chocolates = chocolateTransaction.getChocolates();
//        assertTrue(chocolates.containsKey(ChocolateType.MILK));
//        assertTrue(chocolates.containsKey(ChocolateType.SUGAR_FREE));
//        assertFalse(chocolates.containsKey(ChocolateType.WHITE));
//        assertFalse(chocolates.containsKey(ChocolateType.DARK));
//        List<Chocolate> milkChocolates = chocolates.get(ChocolateType.MILK);
//        List<Chocolate> sugarFreeChocolates = chocolates.get(ChocolateType.SUGAR_FREE);
//        assertEquals(6, milkChocolates.size());
//        assertEquals(1, sugarFreeChocolates.size());
//    }
//
//    @Test
//    public void shouldReturnAFreeUnwrappedSugarFreeChocolateWithAMilkChocolate() throws Exception {
//        ChocolateShop chocolateShop = new ChocolateShopImpl(2, 5);
//        ChocolateTransaction chocolateTransaction = chocolateShop.run(12, ChocolateType.MILK);
//        HashMap<ChocolateType, List<Chocolate>> chocolates = chocolateTransaction.getChocolates();
//        assertTrue(chocolates.containsKey(ChocolateType.MILK));
//        assertTrue(chocolates.containsKey(ChocolateType.SUGAR_FREE));
//        assertFalse(chocolates.containsKey(ChocolateType.WHITE));
//        assertFalse(chocolates.containsKey(ChocolateType.DARK));
//        List<Chocolate> milkChocolates = chocolates.get(ChocolateType.MILK);
//        List<Chocolate> sugarFreeChocolates = chocolates.get(ChocolateType.SUGAR_FREE);
//        assertEquals(7, milkChocolates.size());
//        for (Chocolate milkChocolate : milkChocolates) {
//            assertEquals(ChocolateState.WRAPPED, milkChocolate.getChocolateState());
//        }
//        assertEquals(1, sugarFreeChocolates.size());
//        assertEquals(ChocolateState.UNWRAPPED, sugarFreeChocolates.get(0).getChocolateState());
//    }
//
//    @Test
//    public void shouldNotReturnAnyFreeUnwrappedChocolatesWithDark() throws Exception {
//        ChocolateShop chocolateShop = new ChocolateShopImpl(4, 4);
//        ChocolateTransaction chocolateTransaction = chocolateShop.run(12, ChocolateType.DARK);
//        HashMap<ChocolateType, List<Chocolate>> chocolates = chocolateTransaction.getChocolates();
//        assertTrue(chocolates.containsKey(ChocolateType.DARK));
//        assertFalse(chocolates.containsKey(ChocolateType.SUGAR_FREE));
//        assertFalse(chocolates.containsKey(ChocolateType.MILK));
//        assertFalse(chocolates.containsKey(ChocolateType.WHITE));
//        List<Chocolate> darkChocolates = chocolates.get(ChocolateType.DARK);
//        assertEquals(3, darkChocolates.size());
//        for (Chocolate darkChocolate : darkChocolates) {
//            assertEquals(ChocolateState.WRAPPED, darkChocolate.getChocolateState());
//        }
//    }
//
////    {pocket_cash: 6, price: 2, wrappers_needed: 2, type: :sugar_free}
////    {milk: 0, dark: 1 + 1, white: 0, sugar_free: 3 + 1 + 1}
//    @Test
//    public void shousldNotReturnAnyFreeUnwrappedChocolatesWithDark() throws Exception {
//        ChocolateShop chocolateShop = new ChocolateShopImpl(4, 4);
//        ChocolateTransaction chocolateTransaction = chocolateShop.run(12, ChocolateType.DARK);
//        HashMap<ChocolateType, List<Chocolate>> chocolates = chocolateTransaction.getChocolates();
//        assertTrue(chocolates.containsKey(ChocolateType.DARK));
//        assertFalse(chocolates.containsKey(ChocolateType.SUGAR_FREE));
//        assertFalse(chocolates.containsKey(ChocolateType.MILK));
//        assertFalse(chocolates.containsKey(ChocolateType.WHITE));
//        List<Chocolate> darkChocolates = chocolates.get(ChocolateType.DARK);
//        assertEquals(3, darkChocolates.size());
//        for (Chocolate darkChocolate : darkChocolates) {
//            assertEquals(ChocolateState.WRAPPED, darkChocolate.getChocolateState());
//        }
//    }
//
//
//}