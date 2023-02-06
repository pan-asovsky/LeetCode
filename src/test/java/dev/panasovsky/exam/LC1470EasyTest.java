package dev.panasovsky.exam;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class LC1470EasyTest {

    private final LC1470Easy lc = new LC1470Easy();

    @Test
    void shuffle() {

        final int delimiter = 3;
        final int[] array = new int[] {3, 5, 4, 2, 8, 7};
        final int[] result = lc.shuffle(array, delimiter);
        final int[] trueResult = new int[] {3, 2, 5, 8, 4, 7};

        System.out.println(Arrays.toString(result));
        Assertions.assertArrayEquals(result, trueResult);
    }

    @Test
    void shuffleAgain() {

        final int delimiter = 4;
        final int[] array = new int[] {1, 2, 3, 4, 4, 3, 2, 1};
        final int[] result = lc.shuffle(array, delimiter);
        final int[] trueResult = new int[] {1, 4, 2, 3, 3, 2, 4, 1};

        System.out.println(Arrays.toString(result));
        Assertions.assertArrayEquals(result, trueResult);
    }

}