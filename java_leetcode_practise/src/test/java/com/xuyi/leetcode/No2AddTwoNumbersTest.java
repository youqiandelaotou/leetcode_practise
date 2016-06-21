package com.xuyi.leetcode;
import com.xuyi.leetcode.No2AddTwoNumbers;

import org.junit.Test;

/**
 * Created by ethan on 2016/6/21.
 */
public class No2AddTwoNumbersTest {

    @Test
    public void test(){
        No2AddTwoNumbers.ListNode l1 = new No2AddTwoNumbers.ListNode(2);
        No2AddTwoNumbers.ListNode l1_1 = new No2AddTwoNumbers.ListNode(4);
        No2AddTwoNumbers.ListNode l1_2 = new No2AddTwoNumbers.ListNode(3);
        l1.next = l1_1;
        l1_1.next = l1_2;

        No2AddTwoNumbers.ListNode l2 = new No2AddTwoNumbers.ListNode(5);
        No2AddTwoNumbers.ListNode l2_1 = new No2AddTwoNumbers.ListNode(6);
        No2AddTwoNumbers.ListNode l2_2 = new No2AddTwoNumbers.ListNode(4);
        l2.next = l2_1;
        l2_1.next = l2_2;

//        printList(l1);
        No2AddTwoNumbers.ListNode ans = No2AddTwoNumbers.addTwoNumbers(l1, l2);
        printList(ans);
    }

    public void printList(No2AddTwoNumbers.ListNode l1){
        if (null == l1)
            System.out.println("list is null");
        while (null != l1){
            System.out.print(l1.val + " ");
            l1 = l1.next;
        }
    }

}
