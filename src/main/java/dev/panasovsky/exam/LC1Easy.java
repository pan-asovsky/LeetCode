package dev.panasovsky.exam;

import java.util.Map;
import java.util.HashMap;


/**
 * {@see <a href="https://leetcode.com/problems/two-sum/">Task at LeetCode</a>}
 */
public class LC1Easy {

    public int[] twoSum(final int[] nums, final int target) {

        final Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }

}