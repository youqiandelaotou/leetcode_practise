package com.xuyi.leetcode;

/**
 * Created by ethan on 2016/6/23.
 */
public class No5LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {

        if (null == s || s.length() == 0)
            return null;
        boolean[][] ans = new boolean[s.length()][s.length()];
        for (int i=0; i<ans.length; i++){
            for (int j=0; j<ans[i].length; j++){
                ans[i][j] = true;
            }
        }
        int max = 0;
        int start = 0;
        int end = 0;
        for (int j=1; j<ans.length; j++){
            for (int i=0; i<j; i++){
                if (s.charAt(i) == s.charAt(j)){
                    ans[i][j] = ans[i+1][j-1];
                    if (ans[i][j] && max < j - i + 1){
                        max = j - i + 1;
                        start = i;
                        end = j;
                    }
                }else{
                    ans[i][j] = false;
                }

            }
        }

        return s.substring(start, end+1);
    }
}
