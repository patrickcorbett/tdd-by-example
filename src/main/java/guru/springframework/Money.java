package guru.springframework;

/**
 * @author Patrick Corbett
 */
public abstract class Money {

    protected int amount;
    protected String currency;

    public Money(int pAmount, String pCurrency) {
        amount = pAmount;
        currency = pCurrency;
    }

    /**
     * Currency of the money.
     *
     * @return the string
     */
    protected String currency() {
        return currency;
    }

    /**
     * Multiply the current amount by a multiplier.
     *
     * @param pMultiplier
     *            the multiplier
     * @return the money
     */
    public abstract Money times(int pMultiplier);

    public static Money dollar(int pAmount) {
        return new Dollar(pAmount, "USD");
    }

    public static Money franc(int pAmount) {
        return new Franc(pAmount, "CHF");
    }

    public boolean equals(Object object) {
        // Manual equals, left like this as equals with null will be done later
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(object.getClass());
    }
}
