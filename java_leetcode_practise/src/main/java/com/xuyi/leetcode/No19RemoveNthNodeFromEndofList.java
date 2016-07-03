package com.xuyi.leetcode;

/**
 * Created by ethan on 2016/6/24.
 */
public class No19RemoveNthNodeFromEndofList {

     public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
     }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;
        ListNode head1 = head;
        ListNode head2 = head;
        while (n != 0){
            if (head1 == null)
                return null;
            head1 = head1.next;
            n--;
        }
        ListNode front = new ListNode(0);
        front.next = head;
        ListNode ans = front;
        while (head1 != null){
            head1 = head1.next;
            front = head2;
            head2 = head2.next;
        }
        front.next = head2.next;
        return ans.next;
    }

}
