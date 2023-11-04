package task5;

public class MinimalNumberFinder {
    public static int findMinimalNumber(int[] table) {
        if (table.length == 0) {
            return 0;
        }
        int maxSequenceLength = 0;
        int tempK = 0;
        int maxNum = 0;

        for (int i = 0; i < table.length - 1; i++) {
            maxNum = table[i];
            for (int j = i + 1; j < table.length; j++) {
                if (table[j] > maxNum) {
                    maxNum = table[j];
                    tempK++;
                }
            }
            if (tempK > maxSequenceLength) {
                maxSequenceLength = tempK;
            }
            maxNum = 0;
            tempK = 0;
        }
        return table.length - 1 - maxSequenceLength;
    }
}
