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
    public int minDiffInBST(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        inorder(res,root);
        int minDiff=Integer.MAX_VALUE;
        for(int i=1;i<res.size();i++){
            minDiff=Math.min(minDiff,res.get(i)-res.get(i-1));
        }
        return minDiff;
    }

    public static void inorder(List<Integer> res,TreeNode root){
        if(root==null)return;
        inorder(res,root.left);
        res.add(root.val);
        inorder(res,root.right);
    }
}