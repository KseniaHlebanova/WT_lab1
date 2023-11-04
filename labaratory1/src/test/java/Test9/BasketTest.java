package Test9;

import task9.Basket;
import task9.Ball;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {
    private Basket basket;

    @BeforeEach
    public void setUp() {
        basket = new Basket();
    }

    @Test
    public void testTotalWeight() {
        basket.addBall(new Ball("red", 1.5));
        basket.addBall(new Ball("green", 2.2));

        double totalWeight = basket.getTotalWeight();
        assertEquals(3.7, totalWeight, 0.001);
    }

    @Test
    public void testCountBlueBalls() {
        basket.addBall(new Ball("red", 1.5));
        basket.addBall(new Ball("blue", 2.0));
        basket.addBall(new Ball("blue", 1.0));

        int blueCount = basket.countBlueBalls();
        assertEquals(2, blueCount);
    }
}
