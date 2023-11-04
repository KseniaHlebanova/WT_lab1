package task7;


public class ArraySorter {
    public static double[] sortArray(double[] sourceArray) {
        if (sourceArray.length == 0) {
            return null;
        }
        double[] result = sourceArray.clone();
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - i - 1; j++) {
                if (result[j] > result[j + 1]) {
                    swap(j, j + 1, result);
                }
            }
        }
        return result;
    }

    private static void swap(int index1, int index2, double[] array) {
        double temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

