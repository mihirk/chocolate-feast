package chocolatefeast.model;

import chocolatefeast.factory.ChocolateFactory;

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

    public void addChocolates(Integer countOfChocolates) {
        this.chocolates.addAll(ChocolateFactory.getChocolates(countOfChocolates));
    }

    public Integer getPocketCash() {
        return pocketCash;
    }

    public void setChocolates(List<Chocolate> chocolates) {
        this.chocolates = chocolates;
    }
}
