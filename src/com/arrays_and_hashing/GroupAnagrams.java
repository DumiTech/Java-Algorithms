package com.arrays_and_hashing;

/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
 */

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
//        String[] strs = new String[]{""};
        GroupAnagramsSol result = new GroupAnagramsSol();
        System.out.println(result.getGroupAnagrams(strs));
    }
}

class GroupAnagramsSol {
    public ArrayList getGroupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i <strs.length; i++) {
            String word = strs[i];
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sorted_word = new String(arr);

            if (map.containsKey(sorted_word)) {
                map.get(sorted_word).add(word);
            } else {
                map.put(sorted_word, new ArrayList<>());
                map.get(sorted_word).add(word);
            }
        }
        return new ArrayList(map.values());
    }
}


//class GroupAnagramsSol {
//    public ArrayList getGroupAnagrams(String[] strs) {
//        Map<String, ArrayList<String>> map = new HashMap<>();
//        for (String s : strs) {
//            char[] c = s.toCharArray();
//            Arrays.sort(c);
//            String key = String.valueOf(c);
//            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
//            map.get((key)).add(s);
//        }
//        return new ArrayList<>(map.values());
//    }
//}


//class GroupAnagramsSol {
//    public ArrayList getGroupAnagrams(String[] strs) {
//        Map<String, ArrayList<String>> map = new HashMap<>();
//        for (String s : strs) {
//            char[] ch = new char[26];
//            for (char c : s.toCharArray()) {
//                ch[c - 'a'] ++;
//            }
//            String key = String.valueOf(ch);
//            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
//            map.get(key).add(s);
//        }
//        return new ArrayList(map.values());
//    }
//}






