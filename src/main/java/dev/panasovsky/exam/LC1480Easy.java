package dev.panasovsky.exam;


/**
 * {@see <a href="https://leetcode.com/problems/running-sum-of-1d-array/">Task at LeetCode</a>}
 */
public class LC1480Easy {

    public int[] runningSum(int[] nums) {

        final int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }

}