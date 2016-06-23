package com.xuyi.leetcode;

/**
 * Created by ethan on 2016/6/23.
 */
public class No4MedianofTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1 == null)
            return getMedian(nums2);
        if (nums2 == null)
            return getMedian(nums1);
        int total = nums1.length + nums2.length;
        return (total & 0x1 )== 1 ?
                findMedianSortedArraysImp(nums1, 0, nums1.length-1, nums2, 0, nums2.length-1, total/2 + 1) :
                ((findMedianSortedArraysImp(nums1, 0, nums1.length-1, nums2, 0, nums2.length-1, total/2) +
                        findMedianSortedArraysImp(nums1, 0, nums1.length-1, nums2, 0, nums2.length-1, total/2+1))/2);
    }

    public double findMedianSortedArraysImp(int[] num1, int start1, int end1, int[] num2, int start2, int end2, int k){
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;
        if (len1 > len2)
            return findMedianSortedArraysImp(num2, start2, end2, num1, start1, end1, k);
        if (len1 <= 0)
            return num2[start2 + k - 1];
        if (k == 1)
            return Math.min(num1[start1], num2[start2]);
        int pa = Math.min(k/2, len1);
        int pb = k - pa;
        if (num1[start1 + pa - 1] < num2[start2 + pb - 1])
            return findMedianSortedArraysImp(num1, start1+pa, end1, num2, start2, end2, k-pa);
        else if(num1[start1 + pa - 1] > num2[start2 + pb - 1]){
            return findMedianSortedArraysImp(num1, start1, end1, num2, start2+pb, end2, k-pb);
        }else
            return num1[pa-1];
    }


    public double getMedian(int[] num){
        if (num == null)
            return 0;
        return (num.length & 0x1) == 1 ? num[num.length/2] : (num[num.length/2-1] + num[num.length/2])/2.0;
    }

}
