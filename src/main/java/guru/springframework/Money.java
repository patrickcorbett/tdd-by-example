package guru.springframework;

/**
 * @author Patrick Corbett
 */
public abstract class Money {

    protected int amount;

    /**
     * Abstract Times for money by a multiplier.
     *
     * @param multiplier the multiplier
     * @return the money
     */
    public abstract Money times(int multiplier);

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    public boolean equals(Object object) {
        // Manual equals, left like this as equals with null will be done later
        Money money = (Money) object;
        return amount == money.amount && this.getClass().equals(object.getClass());
    }
}
