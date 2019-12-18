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
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        for (int i = 0; i < arr.size(); i++) {
            primaryDiagonal += arr.get(i).get(i);
            secondaryDiagonal += arr.get(i).get((arr.size() -1) - i);
        }

        return (primaryDiagonal - secondaryDiagonal) * -1;
    }

}
