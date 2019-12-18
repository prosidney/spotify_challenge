package diagonaldifference;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ResultTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void testDiagonalDifference() {
        List<List<Integer>> input = new ArrayList<>();

        input.add(singletonList(3));
        input.add(asList(11, 2, 4));
        input.add(asList(4, 5, 6));
        input.add(asList(10, 8, -12));

        assertEquals(Result.diagonalDifference(input), 15);
    }
}
