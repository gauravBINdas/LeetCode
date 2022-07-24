class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length-1;
        int n=matrix[0].length-1;
        int start=0;
        int end=m;
        int mid=0;
        //find row
        while(start<=end)
        {
            mid=(start+end)/2;
            if(mid>=0&&mid<=m){
            if(matrix[mid][0]<target)
                start=mid+1;
            else if( matrix[mid][0]>target)
                end=mid-1;
            else if(matrix[mid][0]==target)
                return true;
            }
        }
        
        int row=(end>=0)?end:0;
        System.out.println(row);
        //find col
        start=0;
        end=n;
        
        while(start<=end)
        {
            mid=(start+end)/2;
            if(mid>=0&&mid<=n){
            if(matrix[row][mid]<target)
                start=mid+1;
            else if(matrix[row][mid]>target)
                end=mid-1;
            else if(matrix[row][mid]==target)
                return true;
            }
        }
         return false;
    }
}