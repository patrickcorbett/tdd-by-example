package guru.springframework;

/**
 * @author Patrick Corbett
 */
public class Dollar extends Money {

    public Dollar(int pAmount) {
        amount = pAmount;
    }

    @Override
    public Money times(int pMultiplier) {
        return new Dollar(amount * pMultiplier);
    }

}
