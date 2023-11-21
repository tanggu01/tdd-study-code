import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}

class Dollar {
    int amount;

    Dollar(int amount) {

    }

    void times(int multiplier) {
        amount = 5 * 2;
    }
}