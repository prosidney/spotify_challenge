package diagonaldifference;

import java.util.List;

public class Result {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        Integer matrixSize = arr.get(0).get(0);

        int primaryDiagonal = getPrimaryDiagonal(arr, matrixSize);

        int secondaryDiagonal = getSecondaryDiagonal(arr, matrixSize);

        return (primaryDiagonal - secondaryDiagonal) * -1;
    }

    private static int getSecondaryDiagonal(List<List<Integer>> arr, Integer matrixSize) {
        int result = 0;
        for (int i = 0; i < matrixSize; i++) {
            result += arr.get(matrixSize - i).get(i);
        }
        return result;
    }

    private static int getPrimaryDiagonal(List<List<Integer>> arr, Integer matrixSize) {
        int result = 0;
        for (int i = 0; i < matrixSize; i++) {
            result += arr.get(i+1).get(i);
        }
        return result;
    }
}
