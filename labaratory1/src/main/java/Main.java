import task9.Ball;
import task9.Basket;
public class Main {
    public static void main(String[] args) {
        Ball ball1 = new Ball("red", 0.3);
        Ball ball2 = new Ball("blue", 0.4);
        Ball ball3 = new Ball("blue", 0.5);
        Ball ball4 = new Ball("green", 0.6);

        Basket basket = new Basket();
        basket.addBall(ball1);
        basket.addBall(ball2);
        basket.addBall(ball3);
        basket.addBall(ball4);

        System.out.println("Total weight of balls in the basket: " + basket.getTotalWeight() + " kg");
        System.out.println("Number of blue balls in the basket: " + basket.countBlueBalls());
    }
}