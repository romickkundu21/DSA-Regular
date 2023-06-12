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
    public int sumNumbers(TreeNode root) {
        return sum(root,0);
    }

    public static int sum(TreeNode root,int val){
        if(root==null)return 0;
        if(root.right==null && root.left==null){
            return val*10+root.val;
        }
        return sum(root.left,val*10+root.val)+sum(root.right,val*10+root.val);
    }
}