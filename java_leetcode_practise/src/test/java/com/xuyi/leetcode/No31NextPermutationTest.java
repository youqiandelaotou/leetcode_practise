package com.xuyi.leetcode;

import org.junit.Test;

/**
 * Created by ethan on 2016/7/1.
 */
public class No31NextPermutationTest {

    @Test
    public void nextPermutationTest() {

        int[] nums = new int[]{1,2};
        No31NextPermutation.nextPermutation(nums);
        print_arr(nums);
    }

    public void print_arr(int[] nums){
        if (nums == null || nums.length == 0)
            return;
        for (int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }

}
