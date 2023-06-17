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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> res=new HashSet<Integer>();
        for(int i:nums){
            res.add(i);
        }
        int count=0;
        while(head!=null){
            if(res.contains(head.val) && (head.next==null || !res.contains(head.next.val))){
                count++;
            }
            head=head.next;
        }

        return count;
    }
}