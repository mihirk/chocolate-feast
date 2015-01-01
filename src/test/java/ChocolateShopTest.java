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
        assertEquals(6, chocolateShop.run(10, 2, 5).intValue());
        assertEquals(3, chocolateShop.run(12, 4, 4).intValue());
        assertEquals(5, chocolateShop.run(6, 2, 2).intValue());
        assertEquals(136, chocolateShop.run(16809, 123, 11668).intValue());
        assertEquals(1, chocolateShop.run(20373, 18211, 10188).intValue());
        assertEquals(224, chocolateShop.run(92512, 413, 33040).intValue());
        assertEquals(584, chocolateShop.run(2339, 4, 1337).intValue());
        assertEquals(102, chocolateShop.run(96741, 945, 77194).intValue());
        assertEquals(292, chocolateShop.run(53270, 182, 30238).intValue());
        assertEquals(207, chocolateShop.run(47733, 230, 4840).intValue());
        assertEquals(175, chocolateShop.run(60751, 346, 20578).intValue());
        assertEquals(193, chocolateShop.run(19150, 99, 2945).intValue());
        assertEquals(183, chocolateShop.run(94566, 514, 47583).intValue());
        assertEquals(3, chocolateShop.run(17274, 5234, 12885).intValue());
        assertEquals(108, chocolateShop.run(39478, 364, 23991).intValue());
        assertEquals(118, chocolateShop.run(46052, 388, 43028).intValue());
        assertEquals(1, chocolateShop.run(21816, 14645, 1827).intValue());
        assertEquals(1, chocolateShop.run(98573, 74120, 44437).intValue());
        assertEquals(604, chocolateShop.run(47151, 78, 28526).intValue());
        assertEquals(243, chocolateShop.run(18991, 78, 10010).intValue());
        assertEquals(252, chocolateShop.run(28583, 113, 5299).intValue());
        assertEquals(402, chocolateShop.run(34587, 86, 33334).intValue());
        assertEquals(2, chocolateShop.run(59272, 24946, 44416).intValue());
        assertEquals(124, chocolateShop.run(65164, 522, 23728).intValue());
        assertEquals(102, chocolateShop.run(40916, 399, 30670).intValue());
        assertEquals(281, chocolateShop.run(7045, 25, 6484).intValue());
        assertEquals(723, chocolateShop.run(45567, 63, 7564).intValue());
        assertEquals(208, chocolateShop.run(63041, 302, 50870).intValue());
        assertEquals(4830, chocolateShop.run(14440, 3, 275).intValue());
        assertEquals(2, chocolateShop.run(33773, 13179, 6929).intValue());
        assertEquals(220, chocolateShop.run(71656, 325, 52375).intValue());
        assertEquals(1581, chocolateShop.run(1575, 1, 262).intValue());
        assertEquals(285, chocolateShop.run(2216, 8, 35).intValue());
        assertEquals(13, chocolateShop.run(16974, 1248, 6090).intValue());
        assertEquals(238, chocolateShop.run(74892, 314, 48340).intValue());
        assertEquals(53, chocolateShop.run(45312, 848, 44198).intValue());
        assertEquals(1, chocolateShop.run(96428, 81144, 43066).intValue());
        assertEquals(638, chocolateShop.run(61264, 96, 14300).intValue());
        assertEquals(107, chocolateShop.run(52734, 489, 40749).intValue());
        assertEquals(342, chocolateShop.run(42751, 125, 8850).intValue());
        assertEquals(2072, chocolateShop.run(51803, 25, 38253).intValue());
        assertEquals(2, chocolateShop.run(15012, 6806, 2360).intValue());
        assertEquals(440, chocolateShop.run(41447, 94, 8946).intValue());
        assertEquals(104, chocolateShop.run(35849, 343, 28910).intValue());
        assertEquals(265, chocolateShop.run(32715, 123, 21578).intValue());
        assertEquals(101, chocolateShop.run(43344, 425, 7949).intValue());
        assertEquals(403, chocolateShop.run(41986, 104, 18269).intValue());
        assertEquals(132, chocolateShop.run(4893, 37, 921).intValue());
        assertEquals(122, chocolateShop.run(13243, 108, 10845).intValue());
        assertEquals(1, chocolateShop.run(45996, 24153, 38080).intValue());
        assertEquals(132, chocolateShop.run(48630, 366, 48388).intValue());
        assertEquals(118, chocolateShop.run(66474, 560, 50488).intValue());
        assertEquals(146, chocolateShop.run(90041, 613, 9878).intValue());
        assertEquals(186, chocolateShop.run(5975, 32, 4059).intValue());
        assertEquals(158, chocolateShop.run(24892, 157, 3783).intValue());
        assertEquals(147, chocolateShop.run(85276, 579, 4163).intValue());
        assertEquals(101, chocolateShop.run(51005, 503, 44415).intValue());
        assertEquals(1, chocolateShop.run(56364, 40668, 53449).intValue());
        assertEquals(137, chocolateShop.run(78089, 566, 70805).intValue());
        assertEquals(1546, chocolateShop.run(44843, 29, 44838).intValue());
        assertEquals(2, chocolateShop.run(31777, 12538, 1103).intValue());
        assertEquals(102, chocolateShop.run(56037, 545, 24743).intValue());
        assertEquals(298, chocolateShop.run(34612, 116, 21569).intValue());
        assertEquals(133, chocolateShop.run(78806, 591, 64185).intValue());
        assertEquals(116, chocolateShop.run(76790, 661, 44704).intValue());
        assertEquals(1488, chocolateShop.run(77417, 52, 35659).intValue());
        assertEquals(273, chocolateShop.run(59861, 219, 38856).intValue());
        assertEquals(113, chocolateShop.run(10645, 94, 10622).intValue());
        assertEquals(111, chocolateShop.run(4338, 39, 2556).intValue());
        assertEquals(152, chocolateShop.run(78479, 513, 59943).intValue());
        assertEquals(1, chocolateShop.run(12574, 11303, 6650).intValue());
        assertEquals(1, chocolateShop.run(23333, 15178, 16444).intValue());
        assertEquals(2, chocolateShop.run(46143, 19994, 24879).intValue());
        assertEquals(131, chocolateShop.run(7747, 59, 3587).intValue());
        assertEquals(216, chocolateShop.run(72286, 334, 69906).intValue());
        assertEquals(131, chocolateShop.run(99770, 758, 69806).intValue());
        assertEquals(258, chocolateShop.run(85486, 331, 47153).intValue());
        assertEquals(1, chocolateShop.run(85006, 78153, 30358).intValue());
        assertEquals(1, chocolateShop.run(6614, 3887, 5753).intValue());
        assertEquals(296, chocolateShop.run(98046, 331, 68600).intValue());
        assertEquals(1, chocolateShop.run(27454, 24335, 17798).intValue());
        assertEquals(6459, chocolateShop.run(90430, 14, 37004).intValue());
        assertEquals(10253, chocolateShop.run(92285, 9, 56341).intValue());
        assertEquals(127, chocolateShop.run(26628, 209, 4335).intValue());
        assertEquals(1, chocolateShop.run(87158, 54024, 8721).intValue());
        assertEquals(1, chocolateShop.run(7319, 5432, 6940).intValue());
        assertEquals(2, chocolateShop.run(83253, 31055, 76601).intValue());
        assertEquals(107, chocolateShop.run(59908, 556, 23522).intValue());
        assertEquals(189, chocolateShop.run(52587, 277, 50630).intValue());
        assertEquals(221, chocolateShop.run(51942, 234, 27353).intValue());
        assertEquals(3, chocolateShop.run(38224, 9603, 22293).intValue());
        assertEquals(121, chocolateShop.run(39749, 326, 38757).intValue());
        assertEquals(289, chocolateShop.run(94372, 326, 44544).intValue());
        assertEquals(106, chocolateShop.run(31149, 292, 4735).intValue());
        assertEquals(174, chocolateShop.run(60695, 347, 28355).intValue());
        assertEquals(321, chocolateShop.run(29297, 91, 15445).intValue());
        assertEquals(111, chocolateShop.run(60608, 543, 17689).intValue());
        assertEquals(795, chocolateShop.run(22268, 28, 7954).intValue());
        assertEquals(136, chocolateShop.run(7628, 56, 5078).intValue());
        assertEquals(1, chocolateShop.run(17404, 9882, 3646).intValue());
        assertEquals(2, chocolateShop.run(26377, 11981, 13848).intValue());
        assertEquals(436, chocolateShop.run(60217, 144, 24).intValue());
        assertEquals(470, chocolateShop.run(41835, 89, 34999).intValue());
        assertEquals(435, chocolateShop.run(77879, 179, 31082).intValue());
        assertEquals(132, chocolateShop.run(6776, 51, 5473).intValue());
        assertEquals(507, chocolateShop.run(64418, 127, 54187).intValue());
        assertEquals(107, chocolateShop.run(88748, 825, 25437).intValue());
        assertEquals(2390, chocolateShop.run(69332, 29, 21687).intValue());
        assertEquals(1, chocolateShop.run(38654, 37809, 27752).intValue());
        assertEquals(112, chocolateShop.run(84880, 757, 76541).intValue());
        assertEquals(3, chocolateShop.run(28441, 7705, 4276).intValue());
        assertEquals(116, chocolateShop.run(78037, 667, 61963).intValue());
        assertEquals(105, chocolateShop.run(34387, 325, 2593).intValue());
        assertEquals(467, chocolateShop.run(24774, 53, 23837).intValue());
        assertEquals(136, chocolateShop.run(58803, 431, 8270).intValue());
        assertEquals(121, chocolateShop.run(74284, 609, 6760).intValue());
        assertEquals(233, chocolateShop.run(11884, 51, 6499).intValue());
        assertEquals(3538, chocolateShop.run(24769, 7, 13138).intValue());
        assertEquals(107, chocolateShop.run(7723, 72, 917).intValue());
        assertEquals(140, chocolateShop.run(36919, 262, 36431).intValue());
        assertEquals(111, chocolateShop.run(55480, 496, 18054).intValue());
        assertEquals(145, chocolateShop.run(83218, 572, 270).intValue());
        assertEquals(112, chocolateShop.run(11896, 106, 8061).intValue());
        assertEquals(780, chocolateShop.run(92868, 119, 61630).intValue());
        assertEquals(1, chocolateShop.run(67029, 42406, 65482).intValue());
        assertEquals(2, chocolateShop.run(16151, 5659, 13619).intValue());
        assertEquals(137, chocolateShop.run(54305, 395, 17271).intValue());
        assertEquals(1, chocolateShop.run(74054, 72920, 65545).intValue());
        assertEquals(233, chocolateShop.run(45753, 196, 28551).intValue());
        assertEquals(1, chocolateShop.run(4145, 3019, 2607).intValue());
        assertEquals(10003, chocolateShop.run(80026, 8, 43540).intValue());
        assertEquals(240, chocolateShop.run(42342, 176, 13286).intValue());
        assertEquals(360, chocolateShop.run(8281, 23, 5518).intValue());
        assertEquals(277, chocolateShop.run(94516, 341, 48463).intValue());
        assertEquals(412, chocolateShop.run(36675, 89, 10736).intValue());
        assertEquals(2, chocolateShop.run(88109, 31038, 13905).intValue());
        assertEquals(1, chocolateShop.run(45222, 23238, 5933).intValue());
        assertEquals(1, chocolateShop.run(78900, 66292, 45302).intValue());
        assertEquals(104, chocolateShop.run(6970, 67, 2422).intValue());
        assertEquals(1, chocolateShop.run(75850, 72918, 69563).intValue());
        assertEquals(100, chocolateShop.run(8833, 88, 8220).intValue());
        assertEquals(1, chocolateShop.run(89054, 50341, 12699).intValue());
        assertEquals(190, chocolateShop.run(26996, 142, 7001).intValue());
        assertEquals(298, chocolateShop.run(21774, 73, 13594).intValue());
        assertEquals(404, chocolateShop.run(95131, 235, 94956).intValue());
        assertEquals(113, chocolateShop.run(17489, 154, 13015).intValue());
        assertEquals(132, chocolateShop.run(83036, 625, 41851).intValue());
        assertEquals(2, chocolateShop.run(92256, 33304, 78345).intValue());
        assertEquals(1010, chocolateShop.run(68740, 68, 34109).intValue());
        assertEquals(1, chocolateShop.run(56741, 44464, 44937).intValue());
        assertEquals(188, chocolateShop.run(76527, 406, 24956).intValue());
        assertEquals(268, chocolateShop.run(40312, 150, 34596).intValue());
        assertEquals(1780, chocolateShop.run(69422, 39, 38093).intValue());
        assertEquals(1, chocolateShop.run(68456, 46948, 50268).intValue());
        assertEquals(104, chocolateShop.run(99919, 959, 59041).intValue());
        assertEquals(131, chocolateShop.run(22424, 171, 15391).intValue());
        assertEquals(165, chocolateShop.run(85156, 516, 5140).intValue());
        assertEquals(147, chocolateShop.run(4432, 30, 4053).intValue());
        assertEquals(1, chocolateShop.run(2497, 1604, 1925).intValue());
        assertEquals(104, chocolateShop.run(62708, 601, 7268).intValue());
        assertEquals(6, chocolateShop.run(55238, 8343, 8602).intValue());
        assertEquals(552, chocolateShop.run(18786, 34, 16023).intValue());
        assertEquals(579, chocolateShop.run(48086, 83, 22018).intValue());
        assertEquals(263, chocolateShop.run(37739, 143, 22531).intValue());
        assertEquals(3485, chocolateShop.run(17425, 5, 9471).intValue());
        assertEquals(275, chocolateShop.run(8275, 30, 1023).intValue());
        assertEquals(2437, chocolateShop.run(68263, 28, 56980).intValue());
        assertEquals(7, chocolateShop.run(62805, 8203, 47015).intValue());
        assertEquals(277, chocolateShop.run(62145, 224, 8814).intValue());
        assertEquals(141, chocolateShop.run(58714, 416, 17333).intValue());
        assertEquals(214, chocolateShop.run(98043, 457, 91858).intValue());
        assertEquals(120, chocolateShop.run(97605, 807, 28306).intValue());
        assertEquals(120, chocolateShop.run(18571, 154, 16864).intValue());
        assertEquals(113, chocolateShop.run(72333, 638, 12814).intValue());
        assertEquals(115, chocolateShop.run(42501, 367, 15557).intValue());
        assertEquals(3, chocolateShop.run(13185, 3869, 11205).intValue());
        assertEquals(1, chocolateShop.run(57235, 40867, 11374).intValue());
        assertEquals(2, chocolateShop.run(62269, 30396, 37489).intValue());
        assertEquals(103, chocolateShop.run(40087, 386, 32766).intValue());
        assertEquals(171, chocolateShop.run(7543, 44, 4454).intValue());
        assertEquals(113, chocolateShop.run(80973, 711, 45988).intValue());
        assertEquals(104, chocolateShop.run(26849, 257, 19705).intValue());
        assertEquals(347, chocolateShop.run(57397, 165, 16054).intValue());
        assertEquals(306, chocolateShop.run(52662, 172, 22539).intValue());
        assertEquals(237, chocolateShop.run(36141, 152, 25515).intValue());
        assertEquals(591, chocolateShop.run(96333, 163, 91785).intValue());
        assertEquals(156, chocolateShop.run(5327, 34, 5080).intValue());
        assertEquals(11, chocolateShop.run(1528, 131, 1308).intValue());
        assertEquals(2010, chocolateShop.run(22118, 11, 8112).intValue());
        assertEquals(582, chocolateShop.run(30285, 52, 18617).intValue());
        assertEquals(5, chocolateShop.run(22094, 4104, 4118).intValue());
        assertEquals(1295, chocolateShop.run(98446, 76, 73069).intValue());
        assertEquals(3, chocolateShop.run(67107, 18429, 56091).intValue());
        assertEquals(110, chocolateShop.run(19325, 175, 14156).intValue());
        assertEquals(148, chocolateShop.run(51090, 343, 13666).intValue());
        assertEquals(1, chocolateShop.run(54259, 39030, 44860).intValue());
        assertEquals(1, chocolateShop.run(53328, 39959, 48103).intValue());
        assertEquals(136, chocolateShop.run(33533, 245, 16064).intValue());
        assertEquals(192, chocolateShop.run(50204, 261, 36997).intValue());
        assertEquals(330, chocolateShop.run(4586, 14, 98).intValue());
        assertEquals(229, chocolateShop.run(63548, 277, 26922).intValue());
        assertEquals(153, chocolateShop.run(78711, 514, 63338).intValue());
        assertEquals(1164, chocolateShop.run(41894, 36, 640).intValue());
    }
}
