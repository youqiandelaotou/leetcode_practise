package com.xuyi.leetcode;

import java.util.HashMap;

/**
 * Created by ethan on 2016/6/22.
 */
public class No3LongestSubstringWithoutRepeatingCharacter {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        final int LEN = 256;
        int[] loc = new int[LEN];
        for (int i=0; i<LEN; i++){
            loc[i] = -1;
        }

        int idx = -1; int ans = 0;
        for (int i=0; i<s.length(); i++){
            if (loc[(int)s.charAt(i)] > idx){
                idx = loc[(int)s.charAt(i)];
            }
            if (i - idx > ans){
                ans = i - idx;
            }
            loc[(int)s.charAt(i)] = i;
        }
        return ans;
    }
}
