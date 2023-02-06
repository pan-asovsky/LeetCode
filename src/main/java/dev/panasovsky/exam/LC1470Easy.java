package dev.panasovsky.exam;


/**
 * {@see <a href="https://leetcode.com/problems/shuffle-the-array/">Task at LeetCode</a>}
 */
public class LC1470Easy {

    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];
        }
        return result;
    }

}
