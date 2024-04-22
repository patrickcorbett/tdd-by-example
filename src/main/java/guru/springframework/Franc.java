package guru.springframework;

/**
 * @author Patrick Corbett
 */
public class Franc {

    private int amount;

    public Franc(int pAmount) {
        amount = pAmount;
    }

    Franc times(int pMultiplier) {
        return new Franc(amount * pMultiplier);
    }

    public boolean equals(Object object) {
        // Manual equals, left like this as equals with null or other class will be done later
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }

}
