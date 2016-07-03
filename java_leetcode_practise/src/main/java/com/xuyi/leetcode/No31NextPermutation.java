package com.xuyi.leetcode;

/**
 * Created by ethan on 2016/7/1.
 */
public class No31NextPermutation {

    public static void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1)
            return;

        int index=nums.length-1;
        for (; index>0; index--){
            if (nums[index] <= nums[index-1])
                continue;
            else
                break;
        }

//        if (index == 0){
//            for (int i=0; i<nums.length/2; i++){
//                int tmp = 0;
//                tmp = nums[i];
//                nums[i] = nums[nums.length-1-i];
//                nums[nums.length-1-i] = tmp;
//            }
//            return;
//        }else {
            for (int i=nums.length-1; i>index-1; i--){
                if (nums[index-1] < nums[i]){
                    int tmp = nums[index-1];
                    nums[index-1] = nums[i];
                    nums[i] = tmp;
                    break;
                }
            }
            for (int i=index; i<=(index + nums.length-1)/2; i++){
                int tmp = 0;
                tmp = nums[i];
                nums[i] = nums[nums.length - 1 - i + index];
                nums[nums.length-1-i + index] = tmp;
            }
            return;
//        }


    }

    public static void print_arr(int[] nums){
        if (nums == null || nums.length == 0)
            return;
        for (int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
