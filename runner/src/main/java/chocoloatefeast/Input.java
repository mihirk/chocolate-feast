package chocoloatefeast;

public class Input {
    private Integer pocketCash;
    private Integer price;
    private Integer wrappersNeeded;
    private String type;

    public Input(Integer pocketCash, Integer price, Integer wrappersNeeded, String type) {
        this.pocketCash = pocketCash;
        this.price = price;
        this.wrappersNeeded = wrappersNeeded;
        this.type = type;
    }

    public Integer getPocketCash() {
        return pocketCash;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getWrappersNeeded() {
        return wrappersNeeded;
    }

    public String getType() {
        return type;
    }
}
