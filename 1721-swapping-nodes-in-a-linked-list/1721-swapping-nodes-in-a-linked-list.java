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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        ArrayList<Integer> res=new ArrayList<>();
        while(temp!=null){
            res.add(temp.val);
            temp=temp.next;
        }
        int n=res.size();
        Collections.swap(res,k-1,n-k);
        ListNode head2=new ListNode(0);
        ListNode ans=head2;
        for(int i=0;i<n;i++){
            ans.next=new ListNode(res.get(i));
            ans=ans.next;
        }
        return head2.next;
    }
}