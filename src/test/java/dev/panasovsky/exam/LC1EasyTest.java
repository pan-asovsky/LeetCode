package dev.panasovsky.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LC1EasyTest {

    private final LC1Easy lc = new LC1Easy();

    @Test
    public void twoSum() {

        final int[] nums = new int[] {5, 3, 1, 7, 6, 0, 9, 4};
        final int target = 14;

        final int[] result = lc.twoSum(nums, target);
        final int[] trueResult = new int[] {0, 6};
        Assertions.assertArrayEquals(result, trueResult);
    }

}