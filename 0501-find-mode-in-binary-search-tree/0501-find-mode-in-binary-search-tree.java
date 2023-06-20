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
    Integer prev=null;
    int count=1;
    int max=0;
    public int[] findMode(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        inorder(root,res);
        int[] modes=new int[res.size()];
        for(int i=0;i<res.size();i++){
            modes[i]=res.get(i);
        }
        return modes;
    }
    public void inorder(TreeNode root,List<Integer> res){
        if(root==null)return;
        inorder(root.left,res);
        if(prev!=null){
            if(prev==root.val){
                count++;
            }else{
                count=1;
            }
        }
        if(count>max){
            max=count;
            res.clear();
            res.add(root.val);
        }else if(count==max){
            res.add(root.val);
        }
        prev=root.val;

        inorder(root.right,res);
    }
}