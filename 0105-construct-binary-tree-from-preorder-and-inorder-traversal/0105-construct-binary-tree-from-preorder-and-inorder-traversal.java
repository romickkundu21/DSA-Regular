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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0,0,inorder.length-1,inorder,preorder);
    }

    public TreeNode helper(int preStart,int inStart, int inEnd, int[] inorder, int[] preorder){
        if(preStart>preorder.length-1 || inStart>inEnd){
            return null;
        }
        TreeNode root=new TreeNode(preorder[preStart]);
        int inIndex=0;
        for(int i=inStart;i<=inEnd;i++){
            if(root.val==inorder[i]){
                inIndex=i;
            }
        }

        root.left=helper(preStart+1,inStart,inIndex-1,inorder,preorder);
        root.right=helper(preStart+inIndex-inStart+1,inIndex+1,inEnd,inorder,preorder);

        return root;
    }
}