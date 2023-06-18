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
    Set<Integer> res=new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)return false;
        if(findTarget(root.left,k)){
            return true;
        }
        if(res.contains(k-root.val)){
            return true;
        }
        res.add(root.val);
        return findTarget(root.right,k);
    }
}