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
    int maxValue;
    public int maxPathSum(TreeNode root) {
        maxValue=Integer.MIN_VALUE;
        maxSum(root);
        return maxValue;
    }

    public int maxSum(TreeNode root){
        if(root==null)return 0;
        int left=Math.max(0,maxSum(root.left));
        int right=Math.max(0,maxSum(root.right));
        maxValue=Math.max(maxValue,left+right+root.val);
        return Math.max(left,right)+root.val;
    }
}