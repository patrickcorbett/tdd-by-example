package guru.springframework;

/**
 * @author Patrick Corbett
 */
public class Dollar extends Money {

    public Dollar(int pAmount, String pCurrency) {
        super(pAmount, pCurrency);
    }

    @Override
    public Money times(int pMultiplier) {
        return Money.dollar(amount * pMultiplier);
    }
}
