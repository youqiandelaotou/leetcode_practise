package com.xuyi.leetcode;

/**
 * Created by ethan on 2016/6/25.
 */
public class No28ImplementStrStr {

    public static   int strStr(String haystack, String needle) {
        if (haystack == null || needle == null)
            return -1;
        if (needle.length() == 0 )
            return 0;
        int[] next = getNext(needle);
        int j = 0;
        int i = 0;
        while (i<= (haystack.length() - needle.length())){
            for (; j<needle.length(); j++){
                if (needle.charAt(j) != haystack.charAt(i+j))
                    break;;
            }
            if (j == needle.length()){
                return i;
            }
            if (j == 0){
                i ++;
                continue;
            }
            i = i+ j - next[j-1];
            j = next[j-1];
        }
        return -1;
    }

    public static int[] getNext(String needle){

        if(needle == null || needle.length() == 0){
            return null;
        }
        int[] ans = new int[needle.length()];
        ans[0] = 0;
        for (int i=1; i<ans.length; i++){
            if(ans[i-1] > 0 && needle.charAt(ans[i-1]) == needle.charAt(i)){
                ans[i] = ans[i-1] + 1;
            }else if(ans[i-1] == 0 && needle.charAt(i) == needle.charAt(0)){
                ans[i] = 1;
            }else {
                ans[i] = 0;
            }
        }
        return ans;

    }

}
