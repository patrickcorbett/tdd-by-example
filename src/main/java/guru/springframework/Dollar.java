package guru.springframework;

/**
 * @author Patrick Corbett
 */
public class Dollar {

    private int amount;

    public Dollar(int pAmount) {
        amount = pAmount;
    }

    Dollar times(int pMultiplier) {
        return new Dollar(amount * pMultiplier);
    }

    public boolean equals(Object object) {
        // Manual equals, left like this as equals with null or other class will be done later
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }

}
