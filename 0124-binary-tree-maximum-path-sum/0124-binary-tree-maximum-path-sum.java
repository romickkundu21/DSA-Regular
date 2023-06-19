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
    int maxSum=0;
    public int maxPathSum(TreeNode root) {
        maxSum=Integer.MIN_VALUE;
        path(root);
        return maxSum;
    }
    public int path(TreeNode root){
        if(root==null)return 0;
        int left=Math.max(0,path(root.left));
        int right=Math.max(0,path(root.right));
        maxSum=Math.max(maxSum,left+right+root.val);
        return Math.max(left,right)+root.val;
    }
}