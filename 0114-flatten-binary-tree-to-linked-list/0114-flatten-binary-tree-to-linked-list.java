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
    public void flatten(TreeNode root) {
        if(root==null)return;
        Stack<TreeNode> res=new Stack<>();
        res.push(root);
        while(!res.isEmpty()){
            TreeNode curr=res.pop();
            if(curr.right!=null){
                res.push(curr.right);
            }
            if(curr.left!=null){
                res.push(curr.left);
            }
            if(!res.isEmpty()){
                curr.right=res.peek();
            }
            curr.left=null;
        }
    }
}