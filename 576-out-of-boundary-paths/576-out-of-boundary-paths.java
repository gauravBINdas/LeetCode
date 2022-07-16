/*DFS logic, that means Exploration of node, then visit adjacent node */
class Solution {
    private long dp[][][];
    private long totalPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        long paths=0;

        if(startRow>=0&&startRow<m&&startColumn>=0&&startColumn<n)
        {
            //inside boundary
            if(maxMove>0){
                if(dp[maxMove][startRow][startColumn]==-1){
                 paths=(totalPaths(m,n,maxMove-1,startRow-1,startColumn)%1000000007
                    +totalPaths(m,n,maxMove-1,startRow+1,startColumn)%1000000007
                    +totalPaths(m,n,maxMove-1,startRow,startColumn-1)%1000000007
                    +totalPaths(m,n,maxMove-1,startRow,startColumn+1)%1000000007)%1000000007;
                 dp[maxMove][startRow][startColumn]=paths;
                }
                else
                {
                    paths=dp[maxMove][startRow][startColumn];
                }   
            }
        }
        else
        {
            //Outside boundary, 1 path found
            paths=1;
        }
        return paths;
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
         this.dp=new long[maxMove+1][m][n];
         for (long[][] row : dp) {
            for (long[] rowColumn : row) {
                Arrays.fill(rowColumn, -1);
            }
        }
         return (int)totalPaths(m,n,maxMove,startRow,startColumn);
    }
}