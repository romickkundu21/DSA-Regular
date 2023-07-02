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
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer,ListNode> map=new HashMap<>();
        ListNode temp=new ListNode(0);
        temp.next=head;
        int sum=0;
        ListNode node1=temp;
        while(node1!=null){
            sum+=node1.val;
            map.put(sum,node1);
            node1=node1.next;
        }
        sum=0;
        ListNode node2=temp;
        while(node2!=null){
            sum+=node2.val;
            node2.next=map.get(sum).next;
            node2=node2.next;
        }
        
        return temp.next;

    }
}