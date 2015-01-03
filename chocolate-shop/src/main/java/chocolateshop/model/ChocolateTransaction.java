package chocolateshop.model;

import java.util.ArrayList;
import java.util.List;

public class ChocolateTransaction {
    private List<Chocolate> chocolates;
    private Integer pocketCash;

    public ChocolateTransaction() {
        chocolates = new ArrayList<Chocolate>();
    }

    public void setPocketCash(Integer pocketCash) {
        this.pocketCash = pocketCash;
    }

    public List<Chocolate> getChocolates() {
        return chocolates;
    }

    public void addChocolates(List<Chocolate> chocolates) {
        this.chocolates.addAll(chocolates);
    }


    public Integer getPocketCash() {
        return pocketCash;
    }

    public void setChocolates(List<Chocolate> chocolates) {
        this.chocolates = chocolates;
    }

    public void assignChocolateType(ChocolateType chocolateType) {
        for (Chocolate chocolate : chocolates) {
            chocolate.setChocolateType(chocolateType);
        }
    }

    public List<Chocolate> getFreeChocolates() {
        List<Chocolate> freeChocolates = new ArrayList<Chocolate>();
        for (Chocolate chocolate : chocolates) {
            if (chocolate.isFree()) {
                freeChocolates.add(chocolate);
            }
        }
        return freeChocolates;
    }
}
