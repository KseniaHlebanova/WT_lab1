package Test4;

import task4.PrimeNumberFinder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class PrimeNumberFinderTest {
    @Test
    public void testFindPrimeIndexes() {
        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
        int[] arr = {44, 2, 7, 11, 12, 19, 20, 23, 124, 10, 11};
        List<Integer> primeIndexes = primeNumberFinder.findPrimeIndexes(arr);

        Assertions.assertEquals(6, primeIndexes.size()); // Ожидаем, что есть 6 простых чисел
        Assertions.assertEquals(1, primeIndexes.get(0)); // Первое простое число находится в индексе 1
        Assertions.assertEquals(2, primeIndexes.get(1)); // Второе простое число находится в индексе 2
        Assertions.assertEquals(3, primeIndexes.get(2));
        Assertions.assertEquals(5, primeIndexes.get(3));
        Assertions.assertEquals(7, primeIndexes.get(4));
        Assertions.assertEquals(10, primeIndexes.get(5));
    }

    @Test
    public void testIsPrime() {
        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
        Assertions.assertTrue(primeNumberFinder.isPrime(2)); // 2 - простое число
        Assertions.assertTrue(primeNumberFinder.isPrime(13));
        Assertions.assertTrue(primeNumberFinder.isPrime(17));
        Assertions.assertFalse(primeNumberFinder.isPrime(1)); // 1 не является простым числом
        Assertions.assertFalse(primeNumberFinder.isPrime(4));
        Assertions.assertFalse(primeNumberFinder.isPrime(20));
    }
}
