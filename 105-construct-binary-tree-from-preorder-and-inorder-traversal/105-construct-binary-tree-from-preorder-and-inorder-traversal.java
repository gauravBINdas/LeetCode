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
/*
 Preorder traversal -> root,left subtree,right subtree
 Inorder traversal -> left subtree,root,right subtree
 
 Let's consider the basic of binary tree, There's a left subtree and a right subtree and a root.Both the subtree is also a binary tree and follow the same approach again.
 
 So, preorder traversal will provide the root of each subtree.
 Now, we know the very first element of preorder will be our root.
 
 And moving sequentially in preorder will provide the root of each left subtree and once left subtree is explored compeletely, Then it will provide root of right subtree.
 
 So for each root from Preorder, we can decide the left subtree and right subtree from inorder array.
 
 In simple words,
 
 inorder: [a,b,c] 
 preorder: [b,a,c]
 
 from preorder we know,b is root.
 from inorder, we know a is left subtree and c is right subtree.
 b is determined.
 now,
 both subtree can be further divided into
 
 left subtree: { inorder:[a] and preorder:[a] }
 right subtree: { inorder: [c] and preorder: [c] }
 
 This is valid for all subtree and provide a recurrence relation.
 
 NOTE: Not a DP problem.There's no overlapping of sub-problems.Backtracking is the right approach
 
*/
class Solution {
    private int inorder[],preorder[];
    private int pStart=0;
    private TreeNode buildingTree(int iStart,int iEnd)
    {
        TreeNode node=null;
        if(iStart<=iEnd){
        int root=preorder[pStart++];
        node=new TreeNode(root);
        int i;
        for(i=iStart;i<=iEnd;i++)
        {
            if(inorder[i]==root)
                break;
        }
        node.left=buildingTree(iStart,i-1);
        node.right=buildingTree(i+1,iEnd);
        }
        return node;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       this.inorder=inorder;
       this.preorder=preorder;
       return buildingTree(0,inorder.length-1);
    }
}