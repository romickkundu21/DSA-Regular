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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        List<List<Integer>> res1=new ArrayList<>();
        levelorder(res,root,0);
        for(int i=0;i<res.size();i++){
            res1.add(res.get(res.size()-i-1));
        }
        return res1;
    }
    public static void levelorder(List<List<Integer>> res, TreeNode root,int level){
        if(root==null)return;
        if(res.size()==level){
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        levelorder(res,root.left,level+1);
        levelorder(res,root.right,level+1);
    }
}