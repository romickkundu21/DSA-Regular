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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        inorder(root,res);
        int minDiff=Integer.MAX_VALUE;
        for(int i=1;i<res.size();i++){
            minDiff=Math.min(minDiff,Math.abs(res.get(i)-res.get(i-1)));
        }
        return minDiff;

    }
    public static void inorder(TreeNode root, List<Integer> res){
        if(root==null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
}