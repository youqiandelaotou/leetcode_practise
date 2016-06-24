package com.xuyi.leetcode;

/**
 * Created by xuyi7 on 2016/6/24.
 */
public class No9PalindromeNumber {

    // solution 1 reverse integer ans if equals
    // solution 2 compare from head ans last

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x == 0)
            return true;
        int tenlll = 1;
        int x1 = x;
        while (x1 >= 10){
            x1 = x1/10;
            tenlll *= 10;
        }
        int x2 = x;
        int x3 = x;
        while (x2 !=0 ){
            int end = x2 % 10;
            int start = x3 / tenlll;
            if (end != start){
                return false;
            }
            x2 = x2 / 10;
            x3 = x3 % tenlll;
            tenlll /= 10;
        }
        return true;

    }
}
