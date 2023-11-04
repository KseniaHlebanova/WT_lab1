package task1;

import java.lang.Math;

public class ExpressionCalculator {

    public static double calculateExpression(double x, double y) {
        double numerator = calculateNumerator(x, y);
        double denominator = calculateDenominator(x, y);
        return numerator / denominator + x;
    }

    public static double calculateNumerator(double x, double y) {
        return 1 + Math.pow(Math.sin(x + y), 2);
    }

    public static double calculateDenominator(double x, double y) {
        return 2 + Math.abs(x - 2 * x / (1 + x * x * y * y));
    }
}