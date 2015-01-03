package goodbrother.model;

import chocolateshop.model.ChocolateType;

import java.util.List;

public class Sister {
    private Integer chocolateQuantity;
    private List<ChocolateType> chocolateTypesPreferred;

    public Sister(Integer chocolateQuantity, List<ChocolateType> chocolateTypesPreferred) {
        this.chocolateQuantity = chocolateQuantity;
        this.chocolateTypesPreferred = chocolateTypesPreferred;
    }

    public Integer getChocolateQuantity() {
        return chocolateQuantity;
    }

    public List<ChocolateType> getChocolateTypesPreferred() {
        return chocolateTypesPreferred;
    }
}
