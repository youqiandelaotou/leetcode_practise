package com.xuyi.leetcode;

/**
 * Created by xuyi7 on 2016/6/24.
 */
public class No11ContainerWithMostWater {

    public static int maxArea(int[] height) {
        if (height == null || height.length <= 1)
            return 0;
        int right = height.length - 1;
        int left = 0;
        int max = Math.min(height[right], height[left]) * (right - left);
        while (left < right){
            if (height[left] < height[right]){
                int k = left;
                if (left < right && height[k] >= height[left]){
                    left ++;
                }
            }else {
                int k = right;
                if (left < right && height[right] <= height[k]){
                    right --;
                }
            }
            int area = Math.min(height[right], height[left]) * (right - left);
            if (max < area)
                max = area;
        }
        return max;
    }


}
