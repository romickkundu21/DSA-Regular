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
    public int pairSum(ListNode head) {
        ListNode temp=head;
        List<Integer> res=new ArrayList<Integer>();
        while(temp!=null){
            res.add(temp.val);
            temp=temp.next;
        }
        int sum=0;
        for(int i=0;i<res.size()/2;i++){
            sum=Math.max(sum,res.get(i)+res.get(res.size()-1-i));
        }
        return sum;
    }
}