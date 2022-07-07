class Solution {
    private int dp[][];
    private int maxArea(char[][] matrix,int row,int col)
    {

        int max=0;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                if(matrix[i-1][j-1]=='1')
                {
                    dp[i][j]=Math.min(Math.min(dp[i][j-1],dp[i-1][j-1]),dp[i-1][j])+1;
                    max=Math.max(dp[i][j],max);
                }
            }
        }
        return max;
       
    }
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[m-1].length;
        dp=new int[m+1][n+1];
        int side=maxArea(matrix,m,n);
        System.out.println(Arrays.deepToString(dp));
        return side*side;
    }
}