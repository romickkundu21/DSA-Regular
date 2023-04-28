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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0  || head==null || head.next==null)return head;
        ListNode temp=head;
        int len=1;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        temp.next=head;
        k=len-k%len;
        while(k>0){
            temp=temp.next;
            k--;
        }
        head=temp.next;
        temp.next=null;

        return head;
    }
}