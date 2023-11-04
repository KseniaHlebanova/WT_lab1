package Test5;

import task5.MinimalNumberFinder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimalNumberFinderTest {
    @Test
    public void testFindMinimalNumber() {
        int[] input = {3, 2, 8, 5, 6, 1, 7, 9, 4, 10};
        int expected = 5;

        int result = MinimalNumberFinder.findMinimalNumber(input);

        assertEquals(expected, result);
    }
    @Test
    public void testFindMinimalNumber1() {
        int[] input = {10, 8, 6, 4, 2};
        int expected = 4;  // Ожидаем, что ничего не нужно удалять

        int result = MinimalNumberFinder.findMinimalNumber(input);

        assertEquals(expected, result);
    }

    @Test
    public void testFindMinimalNumber2() {
        int[] input = {5, 6, 3, 4, 8, 7, 2, 9, 1};
        int expected = 5;  // Ожидаем, что нужно убрать 6 элементов

        int result = MinimalNumberFinder.findMinimalNumber(input);

        assertEquals(expected, result);
    }
}







