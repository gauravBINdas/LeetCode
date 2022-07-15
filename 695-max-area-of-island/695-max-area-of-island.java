class Solution {
    private int m,n;
    private int grid[][];
    
    private int dfs(int i,int j)
    {
        int area=0;
        if(i>=0&&i<m&&j>=0&&j<n&&grid[i][j]==1)
        {
            area=grid[i][j];
            grid[i][j]=0;
            area+=dfs(i-1,j)+dfs(i+1,j)+dfs(i,j-1)+dfs(i,j+1);
        }
        return area;
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int i,j,max=0;
        int area;
        
        this.grid=grid;
        this.m=grid.length;
        this.n=grid[0].length;
        
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(grid[i][j]==1){
                    area=dfs(i,j);  
                    max=Math.max(max,area);
                }
            }
        }
        return max;
    }
}