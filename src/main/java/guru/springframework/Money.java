package guru.springframework;

/**
 * @author Patrick Corbett
 */
public class Money {

    protected int amount;

    public boolean equals(Object object) {
        // Manual equals, left like this as equals with null or other class will be done later
        Money money = (Money) object;
        return amount == money.amount;
    }
}
