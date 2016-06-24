package com.xuyi.leetcode;

/**
 * Created by xuyi7 on 2016/6/24.
 */
public class No12LongestCommonPrefixTest {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];
        int index = 0;
        while (index < strs[0].length()){
            char ch = strs[0].charAt(index);
            for (int i=1; i<strs.length; i++){
                if (index >= strs[i].length() || ch != strs[i].charAt(index))
                    return strs[0].substring(0, index);
            }
            index ++;
        }
        return strs[0].substring(0, index);
    }

}
