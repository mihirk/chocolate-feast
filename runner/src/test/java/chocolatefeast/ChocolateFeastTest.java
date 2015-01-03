package chocolatefeast;

import chocoloatefeast.ChocolateFeast;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ChocolateFeastTest {
    @Test
    public void testInput1() throws Exception {
        HashMap<String, Object> inputMap = new HashMap<>();
        inputMap.put("pocket_cash", 12);
        inputMap.put("price", 2);
        inputMap.put("wrappers_needed", 5);
        inputMap.put("type", "MILK");
        ChocolateFeast chocolateFeast = new ChocolateFeast();
        HashMap<String, Integer> output = chocolateFeast.runner(inputMap);
        assertEquals(6, output.get("MILK").intValue());
        assertEquals(0, output.get("DARK").intValue());
        assertEquals(0, output.get("WHITE").intValue());
        assertEquals(1, output.get("SUGARFREE").intValue());
    }

    @Test
    public void testInput2() throws Exception {
        HashMap<String, Object> inputMap = new HashMap<>();
        inputMap.put("pocket_cash", 12);
        inputMap.put("price", 4);
        inputMap.put("wrappers_needed", 4);
        inputMap.put("type", "DARK");
        ChocolateFeast chocolateFeast = new ChocolateFeast();
        HashMap<String, Integer> output = chocolateFeast.runner(inputMap);
        assertEquals(0, output.get("MILK").intValue());
        assertEquals(3, output.get("DARK").intValue());
        assertEquals(0, output.get("WHITE").intValue());
        assertEquals(0, output.get("SUGARFREE").intValue());
    }

    @Test
    public void testInput3() throws Exception {
        HashMap<String, Object> inputMap = new HashMap<>();
        inputMap.put("pocket_cash", 6);
        inputMap.put("price", 2);
        inputMap.put("wrappers_needed", 2);
        inputMap.put("type", "SUGARFREE");
        ChocolateFeast chocolateFeast = new ChocolateFeast();
        HashMap<String, Integer> output = chocolateFeast.runner(inputMap);
        assertEquals(0, output.get("MILK").intValue());
        assertEquals(2, output.get("DARK").intValue());
        assertEquals(0, output.get("WHITE").intValue());
        assertEquals(5, output.get("SUGARFREE").intValue());
    }

    @Test
    public void testInput4() throws Exception {
        HashMap<String, Object> inputMap = new HashMap<>();
        inputMap.put("pocket_cash", 6);
        inputMap.put("price", 2);
        inputMap.put("wrappers_needed", 2);
        inputMap.put("type", "WHITE");
        ChocolateFeast chocolateFeast = new ChocolateFeast();
        HashMap<String, Integer> output = chocolateFeast.runner(inputMap);
        assertEquals(0, output.get("MILK").intValue());
        assertEquals(0, output.get("DARK").intValue());
        assertEquals(3, output.get("WHITE").intValue());
        assertEquals(1, output.get("SUGARFREE").intValue());
    }

}