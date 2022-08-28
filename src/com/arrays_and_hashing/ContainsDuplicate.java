package com.arrays_and_hashing;


import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,1};
        int[] nums = {1,2,3,4};
//        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        ContainsDuplicateSol obj = new ContainsDuplicateSol();
        System.out.println(obj.containsDuplicate(nums));
    }
}

class ContainsDuplicateSol {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] == nums[i+1]) return true;
        }
        return false;
    }
}


//class ContainsDuplicateSol {
//    public boolean containsDuplicate(int[] nums) {
////        Set set = new TreeSet();
////        Set set = new LinkedHashSet();
//        Set set = new HashSet();
//        for (int i=0; i<nums.length; i++) {
//            if (set.contains(nums[i])) return true;
//            else set.add(nums[i]);
//        }
//        return false;
//    }
//}

// Brute force, Time Limit Exceeded error on the leetcode, but on IDE is working fine
//class ContainsDuplicateSol {
//    public boolean containsDuplicate(int[] nums) {
//        for (int i=0; i<nums.length; i++) {
//            for (int j=i+1; j<nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                        return true;
//                }
//            }
//        }
//        return false;
//    }
//}


// Time Limit Exceeded on leetcode
//class ContainsDuplicateSol {
//    public boolean containsDuplicate(int[] nums) {
//        LinkedList linkedList = new LinkedList();
//        for (int i=0; i<nums.length; i++) {
//            if (linkedList.contains(nums[i])) return true;
//            else linkedList.add(nums[i]);
//        }
//        return false;
//    }
//}