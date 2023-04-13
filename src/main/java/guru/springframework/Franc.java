/*
 *
 */
package guru.springframework;

/**
 * @author Patrick Corbett
 */
public class Franc extends Money {

    public Franc(int pAmount, String pCurrency) {
        super(pAmount, pCurrency);
    }

    @Override
    public Money times(int pMultiplier) {
        return Money.franc(amount * pMultiplier);
    }
}
