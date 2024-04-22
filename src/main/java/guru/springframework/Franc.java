package guru.springframework;

/**
 * @author Patrick Corbett
 */
public class Franc extends Money {

    public Franc(int pAmount) {
        amount = pAmount;
    }

    @Override
    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
