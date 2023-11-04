package Test8;

import org.junit.jupiter.api.Assertions;
import task8.IndexFinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class IndexFinderTest {
    private double[] firstSequence;
    private double[] secondSequence;
    private List<Integer> indexes;

    @Test
    void testIndexes() {
        firstSequence = new double[]{1.0, 3.0, 5.0, 7.0, 9.0};
        secondSequence = new double[]{2.0, 4.0, 6.0};
        indexes = Arrays.asList(1, 3, 5);
        Assertions.assertEquals(indexes,IndexFinder.findInsertionIndexes(firstSequence,secondSequence));
    }
    @Test
    void testIndexes1() {
        firstSequence = new double[]{3.0, 5.0, 7.0, 9.0};
        secondSequence = new double[]{2.0, 4.0, 6.0};
        indexes = Arrays.asList(0, 2, 4);
        Assertions.assertEquals(indexes,IndexFinder.findInsertionIndexes(firstSequence,secondSequence));
    }
}
