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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> res=new ArrayList<>();
        while(head!=null){
            res.add(head.val);
            head=head.next;
        }
        return converted(res,0,res.size()-1);
    }

    public TreeNode converted(List<Integer> res,int left, int right){
        if(left>right)return null;
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(res.get(mid));
        root.left=converted(res,left,mid-1);
        root.right=converted(res,mid+1,right);
        return root;
    }
}