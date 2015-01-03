package chocoloatefeast;

import chocolateshop.model.Chocolate;
import chocolateshop.model.ChocolateType;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ObjectConversionUtils {

    public static HashMap<String, Integer> convertChocolateListToMap(List<Chocolate> chocolates) {
        HashMap<String, Integer> chocolateMap = new HashMap<>();
        for (Chocolate chocolate : chocolates) {
            int count = 0;
            if (chocolateMap.containsKey(chocolate.getChocolateType().name())) {
                count = chocolateMap.get(chocolate.getChocolateType().name());
            }
            count++;
            chocolateMap.put(chocolate.getChocolateType().name(), count);
        }
        for (ChocolateType chocolateType : ChocolateType.values()) {
            if (!chocolateMap.containsKey(chocolateType.name())) {
                chocolateMap.put(chocolateType.name(), 0);
            }
        }
        return chocolateMap;
    }

    public static Input convertMapToInput(HashMap<String, Object> input) {
        return new Input((Integer) input.get("pocket_cash"), (Integer) input.get("price"), (Integer) input.get("wrappers_needed"), ((String) input.get("type")).toUpperCase());
    }

    public static HashMap<String, Object> jsonToMap(String jsonInput) throws JSONException {
        HashMap<String, Object> inputMap = new HashMap<>();
        JSONObject json = new JSONObject(jsonInput);
        Iterator<?> keys = json.keys();

        while (keys.hasNext()) {
            String key = (String) keys.next();
            Object value = json.get(key);
            inputMap.put(key, value);

        }
        return inputMap;
    }
}
