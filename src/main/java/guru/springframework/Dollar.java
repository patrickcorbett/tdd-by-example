package guru.springframework;

/**
 * @author Patrick Corbett
 */
public class Dollar {

    int amount;

    public Dollar(int pAmount) {
        amount = pAmount;
    }

    Dollar times(int pMultiplier) {
        return new Dollar(amount * pMultiplier);
    }
}
