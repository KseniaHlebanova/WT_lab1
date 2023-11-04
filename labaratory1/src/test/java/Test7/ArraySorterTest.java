package Test7;

import task7.ArraySorter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ArraySorterTest {
    @Test
    public void testSortArray() {
        double[] sourceArray = {5.0, 2.0, 9.0, 1.0, 6.0};
        double[] expected = {1.0, 2.0, 5.0, 6.0, 9.0};

        double[] result = ArraySorter.sortArray(sourceArray);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortEmptyArray() {
        double[] sourceArray = {};
        double[] result = ArraySorter.sortArray(sourceArray);

        assertNull(result);  // Проверяем, что для пустого входного массива результат - null
    }

    @Test
    public void testSortOneElementArray() {
        double[] sourceArray = {3.0};
        double[] expected = {3.0};

        double[] result = ArraySorter.sortArray(sourceArray);

        assertArrayEquals(expected, result);  // Проверяем, что массив с одним элементом остается неизменным
    }

    @Test
    public void testSortArrayWithNegativeNumbers() {
        double[] sourceArray = {-3.0, -1.0, -5.0, -2.0};
        double[] expected = {-5.0, -3.0, -2.0, -1.0};

        double[] result = ArraySorter.sortArray(sourceArray);

        assertArrayEquals(expected, result);  // Проверяем, что отрицательные числа правильно сортируются
    }
}
