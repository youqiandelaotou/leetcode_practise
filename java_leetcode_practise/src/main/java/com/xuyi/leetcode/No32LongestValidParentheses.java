package com.xuyi.leetcode;

import java.util.Stack;

/**
 * Created by ethan on 2016/7/3.
 */
public class No32LongestValidParentheses {

    public static int longestValidParentheses(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }

        boolean[] flag = new boolean[s.length()];
        Stack<Integer> stack = new Stack<Integer>();
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '('){
                stack.push(i);
            }else if (s.charAt(i) == ')' && !stack.empty()){
                int index = stack.pop();
                flag[i] = true;
                flag[index] =true;
            }
        }
        int ans = 0;
        int tmp = 0;
        for (int i=0; i<flag.length; i++){
            if (flag[i]){
                tmp++;
            }else {
                if (ans < tmp){
                    ans = tmp;
                }
                tmp = 0;
            }
        }
        if (ans < tmp){
            ans = tmp;
        }

        return ans;

    }

}
