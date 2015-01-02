package chocolatefeast.model;

public class Chocolate {
    private ChocolateType chocolateType;
    private ChocolateState chocolateState;

    public Chocolate(ChocolateType chocolateType) {
        this.chocolateType = chocolateType;
        this.chocolateState = ChocolateState.WRAPPED;
    }

    public Chocolate(ChocolateType chocolateType, ChocolateState chocolateState) {
        this.chocolateType = chocolateType;
        this.chocolateState = chocolateState;
    }

    public ChocolateState getChocolateState() {
        return chocolateState;
    }

}
