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
    public ListNode partition(ListNode head, int x) {
        ListNode before=new ListNode();
        ListNode temp1=before;
        ListNode after=new ListNode();
        ListNode temp2=after;

        while(head!=null){
            if(head.val<x){
                temp1.next=head;
                temp1=temp1.next;
            }else{
                temp2.next=head;
                temp2=temp2.next;
            }
            head=head.next;
        }
        temp2.next=null;
        temp1.next=after.next;
        return before.next;
        
    }
}