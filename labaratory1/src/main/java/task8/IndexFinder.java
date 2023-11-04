package task8;
import java.util.ArrayList;
import java.util.List;

public class IndexFinder {
    public static List<Integer> findInsertionIndexes(double[] firstSequence, double[] secondSequence) {
        List<Integer> insertionIndices = new ArrayList<>();
        int m = firstSequence.length;
        int n = secondSequence.length;

        int i = 0;
        int j = 0;
        int shift = 0;

        while (i < m && j < n) {
            if (secondSequence[j] <= firstSequence[i]) {
                insertionIndices.add(i + shift);
                shift++;
                j++;
            } else {
                i++;
            }
        }

        while (j < n) {
            insertionIndices.add(i);
            j++;
        }

        return insertionIndices;
    }
}
