package com.arrays_and_hashing;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
 */


import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
//        String s = "anagram", t =  "nagaram";
        String s = "rat", t = "car";
        ValidAnagramSol anagramObj = new ValidAnagramSol();
        System.out.println(anagramObj.isAnagram(s, t));
    }
}

// Solution 1 Using arrays sort
//class ValidAnagramSol {
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) return false;
//        char[] sArr = s.toCharArray();
//        char[] tArr = t.toCharArray();
//        Arrays.sort(sArr);
//        Arrays.sort(tArr);
//        for (int i=0; i<s.length(); i++) {
//            if (sArr[i] != tArr[i]) {
//                return false;
//            }
//        }
//        return true;
//    }
//}

// Solution 2 - considering Unicode support
//class ValidAnagramSol {
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//        int[] count = new int[26];
//
//        for (char c : s.toCharArray()) {
//            count[c - 'a']++;
//        }
//        for (char c : t.toCharArray()) {
//            if (--count[c - 'a'] <0) return false;
//        }
//
//        return true;
//    }
//}


// Solution 3 - considering Unicode support
class ValidAnagramSol {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        int[] alphabet = new int [26];

        for (int i=0; i<sChar.length; i++) {
            alphabet[sChar[i]-'a']++;
            alphabet[tChar[i]-'a']--;
        }

        for (int num: alphabet) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}