package guru.springframework;

/**
 * @author Patrick Corbett
 */
public class Dollar extends Money {

    public Dollar(int pAmount) {
        amount = pAmount;
    }

    @Override
    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
