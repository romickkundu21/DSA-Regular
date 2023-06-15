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
    public ListNode removeNodes(ListNode head) {
        ListNode temp=head;
        Stack<ListNode> res=new Stack<>();
        while(temp!=null){
            res.push(temp);
            temp=temp.next;
        }

        while(!res.isEmpty()){
            if(temp==null || res.peek().val>=temp.val){
                res.peek().next=temp;
                temp=res.peek();
            }
            res.pop();
        }    
        return temp;
    }
}