/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=null;
        ListNode h1=sortList(head);
        ListNode h2=sortList(slow);
        return merge(h1,h2);
    }

    public ListNode merge(ListNode h1,ListNode h2){
        if(h1==null)return h2;
        if(h2==null)return h1;

        if(h1.val<h2.val){
            h1.next=merge(h1.next,h2);
            return h1;
        }
        h2.next=merge(h1,h2.next);
        return h2;
    }
}