package Test6;

import task6.SquareMatrixGenerator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SquareMatrixGeneratorTest {
    @Test
    public void testGenerateSquareMatrix() {
        double[] sourceMatrix = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[][] expected = {
                {1.0, 2.0, 3.0, 4.0, 5.0},
                {2.0, 3.0, 4.0, 5.0, 1.0},
                {3.0, 4.0, 5.0, 1.0, 2.0},
                {4.0, 5.0, 1.0, 2.0, 3.0},
                {5.0, 1.0, 2.0, 3.0, 4.0}
        };

        double[][] result = SquareMatrixGenerator.generateSquareMatrix(sourceMatrix);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testEmptySourceMatrix() {
        double[] sourceMatrix = {};
        double[][] result = SquareMatrixGenerator.generateSquareMatrix(sourceMatrix);

        assertNull(result);  // Проверяем, что для пустой входной матрицы результат - null
    }
}
