package com.xuyi.leetcode;


import java.util.ArrayList;

/**
 * Created by xuyi7 on 2016/6/24.
 */
public class No7ReverseInteger {

    public static int reverse(int x) {
        int flag = 1;
        if (x < 0){
            flag = -1;
            x = -1 * x;
        }
        int[] shu = new int[10];
        int count = 0;
        int yushu = 0;
        while (x!=0){
            yushu = x % 10;
            shu[count ++] = yushu;
            x = x / 10;
        }
        double ans = 0;
        for (int i=0; i<count; i++){
            ans = ans * 10 + shu[i];
        }

        if (ans*flag > Integer.MAX_VALUE || ans*flag < Integer.MIN_VALUE){
            return 0;
        }
        return (int)(flag * ans);

    }

}
