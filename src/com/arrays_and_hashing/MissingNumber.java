package com.arrays_and_hashing;

import java.util.Arrays;

/*
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.
 */

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        FindMissingNumber sol = new FindMissingNumber();
        System.out.println(sol.missingNumber(nums));
    }
}

class FindMissingNumber {
//    public int missingNumber(int [] nums) {
//        // Sort and compare with a variable
//        Arrays.sort(nums);
//        int n = 0;
//        for (int i=0; i<nums.length; i++) {
//            if (n != nums[i]) {
//                return n;
//            }
//            n+=1;
//        }
//        return n;
//    }


    public int missingNumber(int [] nums) {
        // Using Gauss formula to sum up the arithmetic sequence
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return n * (n + 1) / 2 - sum;
    }
}

