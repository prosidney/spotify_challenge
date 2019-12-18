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

        int primaryDiagonal = arr.get(1).get(0) + arr.get(2).get(1) + arr.get(3).get(2);
        int secondaryDiaginal = arr.get(3).get(0) + arr.get(2).get(1) + arr.get(1).get(2);


        return (primaryDiagonal - secondaryDiaginal) * -1;
    }
}
