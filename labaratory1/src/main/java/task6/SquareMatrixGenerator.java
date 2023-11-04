package task6;


public class SquareMatrixGenerator {
    public static double[][] generateSquareMatrix(double[] sourceMatrix) {
        if (sourceMatrix.length == 0) {
            return null;
        }
        int matrixSize = sourceMatrix.length;
        double[][] resultMatrix = new double[matrixSize][matrixSize];
        resultMatrix[0] = sourceMatrix;
        for (int i = 1; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                resultMatrix[i][j] = resultMatrix[i - 1][(j + 1) % matrixSize];
            }
        }
        return resultMatrix;
    }
}

