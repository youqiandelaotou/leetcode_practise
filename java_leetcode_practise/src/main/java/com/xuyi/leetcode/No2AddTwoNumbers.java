package com.xuyi.leetcode;

/**
 * Created by ethan on 2016/6/21.
 */
public class No2AddTwoNumbers {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){

        if (null == l1)
            return l2;
        if (null == l2)
            return l1;
        ListNode ans = new ListNode(0);
        ListNode it = ans;
        int flag = 0;
        while(null != l1 && null != l2){
            int val1 = l1.val;
            int val2 = l2.val;
            int tmp = val1 + val2 + flag;
            if (tmp >= 10){
                flag = 1;
                tmp = tmp - 10;;
            }else{
                flag = 0;
            }
            ListNode tmp_node = new ListNode(tmp);
            it.next = tmp_node;
            it = it.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(null != l1){
            int tmp = l1.val + flag;
            if (tmp >= 10){
                flag = 1;
                tmp = tmp -10;
            }else {
                flag = 0;
            }
            ListNode tmp_node  = new ListNode(tmp);
            it.next = tmp_node;
            it = it.next;
            l1 = l1.next;
        }
        while (null != l2){
            int tmp = flag + l2.val;
            if (tmp >= 10){
                flag = 1;
                tmp = tmp - 10;
            }else {
                flag = 0;
            }
            ListNode tmp_node = new ListNode(tmp);
            it.next = tmp_node;
            it = it.next;
            l2 = l2.next;
        }
        if (flag == 1){
            ListNode tmp = new ListNode(1);
            it.next = tmp;
            it = it.next;
        }
        return ans.next;

    }
}
