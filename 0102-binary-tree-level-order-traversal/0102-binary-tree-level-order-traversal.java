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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        compute(res,root,0);
        return res;
    }

    public static void compute(List<List<Integer>> res, TreeNode root, int level){
        if(root==null)return;
        if(res.size()==level){
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        compute(res,root.left,level+1);
        compute(res,root.right,level+1);
    }
}