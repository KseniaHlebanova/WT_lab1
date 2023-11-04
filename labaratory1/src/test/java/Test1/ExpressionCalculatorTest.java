package Test1;

import org.junit.jupiter.api.Assertions;
import task1.ExpressionCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpressionCalculatorTest {
    @Test
    void testCalculateExpression() {
        double x = 15.0;
        double y = 25.0;
        double result = ExpressionCalculator.calculateExpression(x, y);
        double expected = (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - 2 * x / (1 + x * x * y * y))) + x;
        Assertions.assertEquals(expected, result, 0.001);
    }

    @Test
    void testCalculateNumerator() {
        double x = 15.0;
        double y = 25.0;
        double numeratorResult = ExpressionCalculator.calculateNumerator(x, y);
        double expectedNumerator = 1 + Math.pow(Math.sin(x + y), 2);
        Assertions.assertEquals(expectedNumerator, numeratorResult, 0.001);
    }

    @Test
    void testCalculateDenominator() {
        double x = 15.0;
        double y = 25.0;
        double denominatorResult = ExpressionCalculator.calculateDenominator(x, y);
        double expectedDenominator = 2 + Math.abs(x - 2 * x / (1 + x * x * y * y));
        Assertions.assertEquals(expectedDenominator, denominatorResult, 0.001);
    }
}