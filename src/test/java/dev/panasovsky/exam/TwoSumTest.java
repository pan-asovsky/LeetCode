package dev.panasovsky.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TwoSumTest {

    private final TwoSum sum = new TwoSum();

    @Test
    public void twoSum() {

        final int[] nums = new int[] {5, 3, 1, 7, 6, 0, 9, 4};
        final int target = 14;

        final int[] twoSum = sum.twoSum(nums, target);
        final int first = twoSum[0];
        final int second = twoSum[1];

        Assertions.assertEquals(first, 0);
        Assertions.assertEquals(second, 6);
    }

}