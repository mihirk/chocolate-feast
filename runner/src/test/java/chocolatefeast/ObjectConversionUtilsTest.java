package chocolatefeast;

import chocolateshop.model.Chocolate;
import chocoloatefeast.ObjectConversionUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ObjectConversionUtilsTest {
    @Test
    public void shouldConvertEmptyListToEmptyMapWithAllTypesZero() throws Exception {
        HashMap<String, Integer> output = ObjectConversionUtils.convertChocolateListToMap(new ArrayList<Chocolate>());
        assertEquals(0, output.get("MILK").intValue());
        assertEquals(0, output.get("DARK").intValue());
        assertEquals(0, output.get("WHITE").intValue());
        assertEquals(0, output.get("SUGARFREE").intValue());
    }

    @Test
    public void shouldGiveOutAllTypesEvenIfValueNotPresent() throws Exception {
        HashMap<String, Integer> output = ObjectConversionUtils.convertChocolateListToMap(new ArrayList<Chocolate>());
        assertNotNull(output.get("MILK"));
        assertNotNull(output.get("DARK"));
        assertNotNull(output.get("WHITE"));
        assertNotNull(output.get("SUGARFREE"));
    }


    @Test
    public void shouldConvertJsonToMap() throws Exception {
        String jsonInput = "{\"pocket_cash\":12,\"price\":2,\"wrappers_needed\":5,\"type\":\"milk\"}";
        HashMap<String, Object> output = ObjectConversionUtils.jsonToMap(jsonInput);
        assertNotNull(output.get("pocket_cash"));
        assertNotNull(output.get("price"));
        assertNotNull(output.get("wrappers_needed"));
        assertNotNull(output.get("type"));

        assertEquals(12, output.get("pocket_cash"));
        assertEquals(2, output.get("price"));
        assertEquals(5, output.get("wrappers_needed"));
        assertEquals("milk", output.get("type"));
    }
}