package guru.springframework;

/**
 * @author Patrick Corbett
 */
public class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    /**
     * Currency of the money.
     *
     * @return the string
     */
    protected String currency() {
        return currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public boolean equals(Object object) {
        // Manual equals, left like this as equals with null will be done later
        Money money = (Money) object;
        return amount == money.amount && this.currency.equals(money.currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    /**
     * Times for money by a multiplier.
     *
     * @param multiplier the multiplier
     * @return the money
     */
    public Money times(int multiplier) {
        return new Money(amount * multiplier, this.currency);
    }
}
