package com.xuyi.leetcode;

import org.junit.Test;

/**
 * Created by ethan on 2016/6/23.
 */
public class No4MedianofTwoSortedArraysTest {

    @Test
    public void findMedianSortedArraysTest(){
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        double ans = No4MedianofTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
        System.out.println(ans);
    }

    @Test
    public void getMedianTest(){
        int[] num = new int[]{1,3,6,7,9,10};
        double ans = No4MedianofTwoSortedArrays.getMedian(num);
        System.out.println(ans);
    }
}
