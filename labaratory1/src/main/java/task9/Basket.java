package task9;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> balls;

    public Basket() {
        balls = new ArrayList<>();
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (Ball ball : balls) {
            totalWeight += ball.getWeight();
        }
        return totalWeight;
    }

    public int countBlueBalls() {
        int blueCount = 0;
        for (Ball ball : balls) {
            if (ball.getColor().equalsIgnoreCase("blue")) {
                blueCount++;
            }
        }
        return blueCount;
    }
}
