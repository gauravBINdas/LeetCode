class Solution {
    private char grid[][];
    private boolean visited[][];
    private boolean isRange(int row,int col)
    {
        if(row<0||row>=grid.length)
            return false;
        if(col<0||col>=grid[row].length)
            return false;
        return true;
    }
    private int dfs(int row,int col)
    {
        int count=0;
        if(isRange(row,col)&&!visited[row][col] && grid[row][col]=='1')
        {
            visited[row][col]=true;
            dfs(row,col+1);
            dfs(row+1,col);
            dfs(row,col-1);
            dfs(row-1,col);
            count=1;
        }
        return count;
    }
    public int numIslands(char[][] grid) {
        int sum=0;
        this.grid=grid;
        visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                   if(!visited[i][j]&&grid[i][j]=='1')
                   {
                        sum=sum+dfs(i,j);
                      //  System.out.println("i:"+i+"j:"+j+"sum:"+sum);
                   }
            }
        }
        return sum;
    }
}