package chocolatefeast.model;

public class Chocolate {
    private ChocolateType chocolateType;
    private ChocolateState chocolateState;
    private Integer chocolatePrice;

    public Chocolate() {

    }

    public Chocolate(ChocolateType chocolateType, ChocolateState chocolateState, Integer chocolatePrice) {
        this(chocolateState, chocolatePrice);
        this.chocolateType = chocolateType;
    }

    public Chocolate(ChocolateState chocolateState, Integer chocolatePrice) {
        this.chocolateState = chocolateState;
        this.chocolatePrice = chocolatePrice;
    }

    public void setChocolateType(ChocolateType chocolateType) {
        this.chocolateType = chocolateType;
    }

    public ChocolateType getChocolateType() {
        return chocolateType;
    }

    public ChocolateState getChocolateState() {
        return chocolateState;
    }

    public boolean isFree() {
        return chocolatePrice == 0;
    }
}
