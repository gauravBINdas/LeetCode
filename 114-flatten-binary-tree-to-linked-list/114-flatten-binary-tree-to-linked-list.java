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
        if(root==null)
            return;
        TreeNode Left=root.left;
        TreeNode Right=root.right;
        root.left=null;
    
        flatten(Left);
        flatten(Right);
        
        root.right=Left;
        
        TreeNode curr=root;
        while(curr.right!=null)
        {
            curr=curr.right;
        }
        
        curr.right=Right;
    }
}