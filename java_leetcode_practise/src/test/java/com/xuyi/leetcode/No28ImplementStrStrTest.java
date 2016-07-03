package com.xuyi.leetcode;

import org.junit.Test;

/**
 * Created by ethan on 2016/6/25.
 */
public class No28ImplementStrStrTest {

    @Test
    public void getNextTest(){
        String haystack1 = "BBC ABCDAB ABCDABCDABDE";
        String needle1 = "ABCDABD";


        String haystack = "mississippi";
        String needle = "issip";

        System.out.println(No28ImplementStrStr.strStr(haystack1, needle1));


        int[] arr = No28ImplementStrStr.getNext(needle);
        if(arr == null)
            System.out.println("arr is null... ...");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
