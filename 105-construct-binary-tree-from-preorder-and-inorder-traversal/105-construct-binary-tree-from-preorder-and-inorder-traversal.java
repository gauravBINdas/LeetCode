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
    private int inorder[],preorder[];
    private int pStart=0;
    public TreeNode buildingTree(int iStart,int iEnd)
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
       // System.out.println(iStart+","+(i-1)+","+(pStart+1));
        node.left=buildingTree(iStart,i-1);
        //System.out.println((i+1)+","+iEnd+","+(pStart+1));
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