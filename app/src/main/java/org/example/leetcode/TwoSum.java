package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            var currentValue = nums[index];
            var expected = target - currentValue;
            if (seen.containsKey(expected)){
                return new int[]{seen.get(expected), index};
            } else {
                seen.put(currentValue, index);
            }
        }
        return new int[]{-1, -1}; // unexpected input
    }
}
