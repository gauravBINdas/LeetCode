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
    private double avgInLevel(Queue<TreeNode> queue1,Queue<TreeNode> queue2)
    {
        double ans=0;
        int count=0;
        TreeNode temp;
        while(!queue1.isEmpty())
        {
            temp=queue1.poll();
            if(temp!=null)
            {
                ans+=temp.val;
                ++count;
            }
            if(temp.left!=null)
                queue2.add(temp.left);
            if(temp.right!=null)
                queue2.add(temp.right);
        }
        return ans/count;
    }
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue1;
        Queue<TreeNode> queue2=new LinkedList<>();
        List<Double> list=new ArrayList<>();
        if(root!=null)
        {
            queue2.add(root);
            do{
                queue1=queue2;
                queue2=new LinkedList<>();
                list.add(avgInLevel(queue1,queue2));
            }while(!queue2.isEmpty());
            
        }
       return list;
    }
}