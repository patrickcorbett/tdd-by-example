package guru.springframework;

/**
 * @author Patrick Corbett
 */
public class Dollar {

    int amount;

    public Dollar(int pAmount) {
        amount = pAmount;
    }

    void times(int pMultiplier) {
        amount *= pMultiplier;
    }
}
