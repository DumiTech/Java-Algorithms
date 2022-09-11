package com.arrays_and_hashing;

/*
Given an array of integers nums and an integer target, return indices of
the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you
may not use the same element twice.

You can return the answer in any order.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        TwoSumSolution sol = new TwoSumSolution();
        System.out.println(sol.twoSum(nums, target));
    }
}

class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        // Solution 1
        // Time complexity: O(n)
        //  Space complexity: O(n)
        int[] result = new int[2];
        Map <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
//
//class TwoSumSolution {
//    public int[] twoSum(int[] nums, int target) {
//        // Solution 2
//        // Time complexity: O(n^2)
//        //  Space complexity: O(n)
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }
//}