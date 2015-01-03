import chocolatefeast.ChocolateShop;
import chocolatefeast.InvalidInput;
import chocolatefeast.impl.OldChocolateShopImpl;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

public class OldChocolateShopTest {

    private ChocolateShop oldChocolateShop;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private int oldChocolateShopWrapper(int pocketCash, int chocolatePrice, int wrappersNeeded) throws InvalidInput {
        oldChocolateShop = new OldChocolateShopImpl(chocolatePrice, wrappersNeeded);
        return oldChocolateShop.transact(pocketCash, null).size();
    }

    @Test
    public void shouldReturnZeroIfCashInPocketIsZero() throws Exception {
        int numberOfChocolates = oldChocolateShopWrapper(0, 1, 1);
        assertEquals(0, numberOfChocolates);
    }

    @Test
    public void shouldThrowInfinityExceptionIfChocolateIsForFree() throws Exception {
        thrown.expect(InvalidInput.class);
        oldChocolateShopWrapper(1, 0, 0);
    }

    @Test
    public void shouldThrowInfinityExceptionIfWrappersNeededIsZero() throws Exception {
        thrown.expect(InvalidInput.class);
        oldChocolateShopWrapper(1, 1, 0);
    }

    @Test
    public void shouldReturnTheInitialNumberOfChocolatesIfWrappersRequiredIsInfinity() throws Exception {
        thrown.expect(InvalidInput.class);
        oldChocolateShopWrapper(1, 0, Integer.MAX_VALUE);
    }

    //Test dataset downloaded from hacker earth, and some regex find and replace to generate these assertions
    @Test
    public void shouldReturnTheNumberOfChocolates() throws Exception {
        assertEquals(6, oldChocolateShopWrapper(10, 2, 5));
        assertEquals(3, oldChocolateShopWrapper(12, 4, 4));
        assertEquals(5, oldChocolateShopWrapper(6, 2, 2));
        assertEquals(136, oldChocolateShopWrapper(16809, 123, 11668));
        assertEquals(1, oldChocolateShopWrapper(20373, 18211, 10188));
        assertEquals(224, oldChocolateShopWrapper(92512, 413, 33040));
        assertEquals(584, oldChocolateShopWrapper(2339, 4, 1337));
        assertEquals(102, oldChocolateShopWrapper(96741, 945, 77194));
        assertEquals(292, oldChocolateShopWrapper(53270, 182, 30238));
        assertEquals(207, oldChocolateShopWrapper(47733, 230, 4840));
        assertEquals(175, oldChocolateShopWrapper(60751, 346, 20578));
        assertEquals(193, oldChocolateShopWrapper(19150, 99, 2945));
        assertEquals(183, oldChocolateShopWrapper(94566, 514, 47583));
        assertEquals(3, oldChocolateShopWrapper(17274, 5234, 12885));
        assertEquals(108, oldChocolateShopWrapper(39478, 364, 23991));
        assertEquals(118, oldChocolateShopWrapper(46052, 388, 43028));
        assertEquals(1, oldChocolateShopWrapper(21816, 14645, 1827));
        assertEquals(1, oldChocolateShopWrapper(98573, 74120, 44437));
        assertEquals(604, oldChocolateShopWrapper(47151, 78, 28526));
        assertEquals(243, oldChocolateShopWrapper(18991, 78, 10010));
        assertEquals(252, oldChocolateShopWrapper(28583, 113, 5299));
        assertEquals(402, oldChocolateShopWrapper(34587, 86, 33334));
        assertEquals(2, oldChocolateShopWrapper(59272, 24946, 44416));
        assertEquals(124, oldChocolateShopWrapper(65164, 522, 23728));
        assertEquals(102, oldChocolateShopWrapper(40916, 399, 30670));
        assertEquals(281, oldChocolateShopWrapper(7045, 25, 6484));
        assertEquals(723, oldChocolateShopWrapper(45567, 63, 7564));
        assertEquals(208, oldChocolateShopWrapper(63041, 302, 50870));
        assertEquals(4830, oldChocolateShopWrapper(14440, 3, 275));
        assertEquals(2, oldChocolateShopWrapper(33773, 13179, 6929));
        assertEquals(220, oldChocolateShopWrapper(71656, 325, 52375));
        assertEquals(1581, oldChocolateShopWrapper(1575, 1, 262));
        assertEquals(285, oldChocolateShopWrapper(2216, 8, 35));
        assertEquals(13, oldChocolateShopWrapper(16974, 1248, 6090));
        assertEquals(238, oldChocolateShopWrapper(74892, 314, 48340));
        assertEquals(53, oldChocolateShopWrapper(45312, 848, 44198));
        assertEquals(1, oldChocolateShopWrapper(96428, 81144, 43066));
        assertEquals(638, oldChocolateShopWrapper(61264, 96, 14300));
        assertEquals(107, oldChocolateShopWrapper(52734, 489, 40749));
        assertEquals(342, oldChocolateShopWrapper(42751, 125, 8850));
        assertEquals(2072, oldChocolateShopWrapper(51803, 25, 38253));
        assertEquals(2, oldChocolateShopWrapper(15012, 6806, 2360));
        assertEquals(440, oldChocolateShopWrapper(41447, 94, 8946));
        assertEquals(104, oldChocolateShopWrapper(35849, 343, 28910));
        assertEquals(265, oldChocolateShopWrapper(32715, 123, 21578));
        assertEquals(101, oldChocolateShopWrapper(43344, 425, 7949));
        assertEquals(403, oldChocolateShopWrapper(41986, 104, 18269));
        assertEquals(132, oldChocolateShopWrapper(4893, 37, 921));
        assertEquals(122, oldChocolateShopWrapper(13243, 108, 10845));
        assertEquals(1, oldChocolateShopWrapper(45996, 24153, 38080));
        assertEquals(132, oldChocolateShopWrapper(48630, 366, 48388));
        assertEquals(118, oldChocolateShopWrapper(66474, 560, 50488));
        assertEquals(146, oldChocolateShopWrapper(90041, 613, 9878));
        assertEquals(186, oldChocolateShopWrapper(5975, 32, 4059));
        assertEquals(158, oldChocolateShopWrapper(24892, 157, 3783));
        assertEquals(147, oldChocolateShopWrapper(85276, 579, 4163));
        assertEquals(101, oldChocolateShopWrapper(51005, 503, 44415));
        assertEquals(1, oldChocolateShopWrapper(56364, 40668, 53449));
        assertEquals(137, oldChocolateShopWrapper(78089, 566, 70805));
        assertEquals(1546, oldChocolateShopWrapper(44843, 29, 44838));
        assertEquals(2, oldChocolateShopWrapper(31777, 12538, 1103));
        assertEquals(102, oldChocolateShopWrapper(56037, 545, 24743));
        assertEquals(298, oldChocolateShopWrapper(34612, 116, 21569));
        assertEquals(133, oldChocolateShopWrapper(78806, 591, 64185));
        assertEquals(116, oldChocolateShopWrapper(76790, 661, 44704));
        assertEquals(1488, oldChocolateShopWrapper(77417, 52, 35659));
        assertEquals(273, oldChocolateShopWrapper(59861, 219, 38856));
        assertEquals(113, oldChocolateShopWrapper(10645, 94, 10622));
        assertEquals(111, oldChocolateShopWrapper(4338, 39, 2556));
        assertEquals(152, oldChocolateShopWrapper(78479, 513, 59943));
        assertEquals(1, oldChocolateShopWrapper(12574, 11303, 6650));
        assertEquals(1, oldChocolateShopWrapper(23333, 15178, 16444));
        assertEquals(2, oldChocolateShopWrapper(46143, 19994, 24879));
        assertEquals(131, oldChocolateShopWrapper(7747, 59, 3587));
        assertEquals(216, oldChocolateShopWrapper(72286, 334, 69906));
        assertEquals(131, oldChocolateShopWrapper(99770, 758, 69806));
        assertEquals(258, oldChocolateShopWrapper(85486, 331, 47153));
        assertEquals(1, oldChocolateShopWrapper(85006, 78153, 30358));
        assertEquals(1, oldChocolateShopWrapper(6614, 3887, 5753));
        assertEquals(296, oldChocolateShopWrapper(98046, 331, 68600));
        assertEquals(1, oldChocolateShopWrapper(27454, 24335, 17798));
        assertEquals(6459, oldChocolateShopWrapper(90430, 14, 37004));
        assertEquals(10253, oldChocolateShopWrapper(92285, 9, 56341));
        assertEquals(127, oldChocolateShopWrapper(26628, 209, 4335));
        assertEquals(1, oldChocolateShopWrapper(87158, 54024, 8721));
        assertEquals(1, oldChocolateShopWrapper(7319, 5432, 6940));
        assertEquals(2, oldChocolateShopWrapper(83253, 31055, 76601));
        assertEquals(107, oldChocolateShopWrapper(59908, 556, 23522));
        assertEquals(189, oldChocolateShopWrapper(52587, 277, 50630));
        assertEquals(221, oldChocolateShopWrapper(51942, 234, 27353));
        assertEquals(3, oldChocolateShopWrapper(38224, 9603, 22293));
        assertEquals(121, oldChocolateShopWrapper(39749, 326, 38757));
        assertEquals(289, oldChocolateShopWrapper(94372, 326, 44544));
        assertEquals(106, oldChocolateShopWrapper(31149, 292, 4735));
        assertEquals(174, oldChocolateShopWrapper(60695, 347, 28355));
        assertEquals(321, oldChocolateShopWrapper(29297, 91, 15445));
        assertEquals(111, oldChocolateShopWrapper(60608, 543, 17689));
        assertEquals(795, oldChocolateShopWrapper(22268, 28, 7954));
        assertEquals(136, oldChocolateShopWrapper(7628, 56, 5078));
        assertEquals(1, oldChocolateShopWrapper(17404, 9882, 3646));
        assertEquals(2, oldChocolateShopWrapper(26377, 11981, 13848));
        assertEquals(436, oldChocolateShopWrapper(60217, 144, 24));
        assertEquals(470, oldChocolateShopWrapper(41835, 89, 34999));
        assertEquals(435, oldChocolateShopWrapper(77879, 179, 31082));
        assertEquals(132, oldChocolateShopWrapper(6776, 51, 5473));
        assertEquals(507, oldChocolateShopWrapper(64418, 127, 54187));
        assertEquals(107, oldChocolateShopWrapper(88748, 825, 25437));
        assertEquals(2390, oldChocolateShopWrapper(69332, 29, 21687));
        assertEquals(1, oldChocolateShopWrapper(38654, 37809, 27752));
        assertEquals(112, oldChocolateShopWrapper(84880, 757, 76541));
        assertEquals(3, oldChocolateShopWrapper(28441, 7705, 4276));
        assertEquals(116, oldChocolateShopWrapper(78037, 667, 61963));
        assertEquals(105, oldChocolateShopWrapper(34387, 325, 2593));
        assertEquals(467, oldChocolateShopWrapper(24774, 53, 23837));
        assertEquals(136, oldChocolateShopWrapper(58803, 431, 8270));
        assertEquals(121, oldChocolateShopWrapper(74284, 609, 6760));
        assertEquals(233, oldChocolateShopWrapper(11884, 51, 6499));
        assertEquals(3538, oldChocolateShopWrapper(24769, 7, 13138));
        assertEquals(107, oldChocolateShopWrapper(7723, 72, 917));
        assertEquals(140, oldChocolateShopWrapper(36919, 262, 36431));
        assertEquals(111, oldChocolateShopWrapper(55480, 496, 18054));
        assertEquals(145, oldChocolateShopWrapper(83218, 572, 270));
        assertEquals(112, oldChocolateShopWrapper(11896, 106, 8061));
        assertEquals(780, oldChocolateShopWrapper(92868, 119, 61630));
        assertEquals(1, oldChocolateShopWrapper(67029, 42406, 65482));
        assertEquals(2, oldChocolateShopWrapper(16151, 5659, 13619));
        assertEquals(137, oldChocolateShopWrapper(54305, 395, 17271));
        assertEquals(1, oldChocolateShopWrapper(74054, 72920, 65545));
        assertEquals(233, oldChocolateShopWrapper(45753, 196, 28551));
        assertEquals(1, oldChocolateShopWrapper(4145, 3019, 2607));
        assertEquals(10003, oldChocolateShopWrapper(80026, 8, 43540));
        assertEquals(240, oldChocolateShopWrapper(42342, 176, 13286));
        assertEquals(360, oldChocolateShopWrapper(8281, 23, 5518));
        assertEquals(277, oldChocolateShopWrapper(94516, 341, 48463));
        assertEquals(412, oldChocolateShopWrapper(36675, 89, 10736));
        assertEquals(2, oldChocolateShopWrapper(88109, 31038, 13905));
        assertEquals(1, oldChocolateShopWrapper(45222, 23238, 5933));
        assertEquals(1, oldChocolateShopWrapper(78900, 66292, 45302));
        assertEquals(104, oldChocolateShopWrapper(6970, 67, 2422));
        assertEquals(1, oldChocolateShopWrapper(75850, 72918, 69563));
        assertEquals(100, oldChocolateShopWrapper(8833, 88, 8220));
        assertEquals(1, oldChocolateShopWrapper(89054, 50341, 12699));
        assertEquals(190, oldChocolateShopWrapper(26996, 142, 7001));
        assertEquals(298, oldChocolateShopWrapper(21774, 73, 13594));
        assertEquals(404, oldChocolateShopWrapper(95131, 235, 94956));
        assertEquals(113, oldChocolateShopWrapper(17489, 154, 13015));
        assertEquals(132, oldChocolateShopWrapper(83036, 625, 41851));
        assertEquals(2, oldChocolateShopWrapper(92256, 33304, 78345));
        assertEquals(1010, oldChocolateShopWrapper(68740, 68, 34109));
        assertEquals(1, oldChocolateShopWrapper(56741, 44464, 44937));
        assertEquals(188, oldChocolateShopWrapper(76527, 406, 24956));
        assertEquals(268, oldChocolateShopWrapper(40312, 150, 34596));
        assertEquals(1780, oldChocolateShopWrapper(69422, 39, 38093));
        assertEquals(1, oldChocolateShopWrapper(68456, 46948, 50268));
        assertEquals(104, oldChocolateShopWrapper(99919, 959, 59041));
        assertEquals(131, oldChocolateShopWrapper(22424, 171, 15391));
        assertEquals(165, oldChocolateShopWrapper(85156, 516, 5140));
        assertEquals(147, oldChocolateShopWrapper(4432, 30, 4053));
        assertEquals(1, oldChocolateShopWrapper(2497, 1604, 1925));
        assertEquals(104, oldChocolateShopWrapper(62708, 601, 7268));
        assertEquals(6, oldChocolateShopWrapper(55238, 8343, 8602));
        assertEquals(552, oldChocolateShopWrapper(18786, 34, 16023));
        assertEquals(579, oldChocolateShopWrapper(48086, 83, 22018));
        assertEquals(263, oldChocolateShopWrapper(37739, 143, 22531));
        assertEquals(3485, oldChocolateShopWrapper(17425, 5, 9471));
        assertEquals(275, oldChocolateShopWrapper(8275, 30, 1023));
        assertEquals(2437, oldChocolateShopWrapper(68263, 28, 56980));
        assertEquals(7, oldChocolateShopWrapper(62805, 8203, 47015));
        assertEquals(277, oldChocolateShopWrapper(62145, 224, 8814));
        assertEquals(141, oldChocolateShopWrapper(58714, 416, 17333));
        assertEquals(214, oldChocolateShopWrapper(98043, 457, 91858));
        assertEquals(120, oldChocolateShopWrapper(97605, 807, 28306));
        assertEquals(120, oldChocolateShopWrapper(18571, 154, 16864));
        assertEquals(113, oldChocolateShopWrapper(72333, 638, 12814));
        assertEquals(115, oldChocolateShopWrapper(42501, 367, 15557));
        assertEquals(3, oldChocolateShopWrapper(13185, 3869, 11205));
        assertEquals(1, oldChocolateShopWrapper(57235, 40867, 11374));
        assertEquals(2, oldChocolateShopWrapper(62269, 30396, 37489));
        assertEquals(103, oldChocolateShopWrapper(40087, 386, 32766));
        assertEquals(171, oldChocolateShopWrapper(7543, 44, 4454));
        assertEquals(113, oldChocolateShopWrapper(80973, 711, 45988));
        assertEquals(104, oldChocolateShopWrapper(26849, 257, 19705));
        assertEquals(347, oldChocolateShopWrapper(57397, 165, 16054));
        assertEquals(306, oldChocolateShopWrapper(52662, 172, 22539));
        assertEquals(237, oldChocolateShopWrapper(36141, 152, 25515));
        assertEquals(591, oldChocolateShopWrapper(96333, 163, 91785));
        assertEquals(156, oldChocolateShopWrapper(5327, 34, 5080));
        assertEquals(11, oldChocolateShopWrapper(1528, 131, 1308));
        assertEquals(2010, oldChocolateShopWrapper(22118, 11, 8112));
        assertEquals(582, oldChocolateShopWrapper(30285, 52, 18617));
        assertEquals(5, oldChocolateShopWrapper(22094, 4104, 4118));
        assertEquals(1295, oldChocolateShopWrapper(98446, 76, 73069));
        assertEquals(3, oldChocolateShopWrapper(67107, 18429, 56091));
        assertEquals(110, oldChocolateShopWrapper(19325, 175, 14156));
        assertEquals(148, oldChocolateShopWrapper(51090, 343, 13666));
        assertEquals(1, oldChocolateShopWrapper(54259, 39030, 44860));
        assertEquals(1, oldChocolateShopWrapper(53328, 39959, 48103));
        assertEquals(136, oldChocolateShopWrapper(33533, 245, 16064));
        assertEquals(192, oldChocolateShopWrapper(50204, 261, 36997));
        assertEquals(330, oldChocolateShopWrapper(4586, 14, 98));
        assertEquals(229, oldChocolateShopWrapper(63548, 277, 26922));
        assertEquals(153, oldChocolateShopWrapper(78711, 514, 63338));
        assertEquals(1164, oldChocolateShopWrapper(41894, 36, 640));
    }
}
