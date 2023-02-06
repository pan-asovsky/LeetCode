package dev.panasovsky.exam;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class LC1480EasyTest {

    private final LC1480Easy lc = new LC1480Easy();

    @Test
    public void first() {

        final int[] nums = new int[] {1, 2, 3, 4};
        final int[] runningSum = lc.runningSum(nums);

        final int[] trueResult = new int[] {1, 3, 6, 10};
        Assertions.assertArrayEquals(runningSum, trueResult);
    }

    @Test
    public void second() {

        final int[] nums = new int[] {1, 1, 1, 1, 1, 1, 1};
        final int[] runningSum = lc.runningSum(nums);

        final int[] trueResult = new int[] {1, 2, 3, 4, 5, 6, 7};
        Assertions.assertArrayEquals(runningSum, trueResult);
    }
}