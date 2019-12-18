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
        int primaryDiagonal = getPrimaryDiagonal(arr);

        int secondaryDiagonal = getSecondaryDiagonal(arr);

        return (primaryDiagonal - secondaryDiagonal) * -1;
    }

    private static int getSecondaryDiagonal(List<List<Integer>> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            result += arr.get(i).get((arr.size() -1) - i);
        }
        return result;
    }

    private static int getPrimaryDiagonal(List<List<Integer>> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            result += arr.get(i).get(i);
        }
        return result;
    }
}
