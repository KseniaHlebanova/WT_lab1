package task4;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFinder {
    public List<Integer> findPrimeIndexes(int[] arr) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public void printIndexes(List<Integer> indexes) {
        for (int ind : indexes) {
            System.out.print(ind + ", ");
        }
    }
}
