class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        int pivot=matrix[row][col];
        int m=matrix.length-1;
        boolean res=false;
        
        while(row<=m&&col>=0)
        {
            if(pivot<target)
                row++;
            else if(pivot>target)
                col--;
            else if(pivot==target)
            {
                res=true;
                break;
            }
            if(row<=m && col>=0)
                 pivot=matrix[row][col];
        }
        return res;
    }
}