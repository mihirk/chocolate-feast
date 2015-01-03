package chocoloatefeast;

import chocolateshop.ChocolateShop;
import chocolateshop.InvalidInput;
import chocolateshop.impl.ChocolateShopImpl;
import chocolateshop.model.Chocolate;
import chocolateshop.model.ChocolateType;
import goodbrother.ChocolateShopVisit;
import goodbrother.model.Brother;
import goodbrother.model.Sister;
import org.json.JSONException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ChocolateFeast {

    public static HashMap<String, Integer> runner(HashMap<String, Object> inputMap) throws InvalidInput {
        Input input = ObjectConversionUtils.convertMapToInput(inputMap);
        ChocolateShop chocolateShop = new ChocolateShopImpl(input.getPrice(), input.getWrappersNeeded());
        Brother brother = new Brother(input.getPocketCash(), ChocolateType.valueOf(input.getType()));
        Sister sister = new Sister(1, Arrays.asList(ChocolateType.MILK, ChocolateType.WHITE));
        List<Chocolate> chocolates = ChocolateShopVisit.getChocolates(brother, sister, chocolateShop);
        return ObjectConversionUtils.convertChocolateListToMap(chocolates);
    }

    public static void main(String[] args) throws JSONException, InvalidInput {
        Scanner in = new Scanner(System.in);
        String jsonInput;
        while (true) {
            System.out.println("\nEnter JSON input\n");
            jsonInput = in.nextLine();
            HashMap<String, Object> inputMap = ObjectConversionUtils.jsonToMap(jsonInput);
            System.out.println(runner(inputMap));
        }
    }

}
