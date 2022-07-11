
class Solution {
    private int[] HardestRemainingJob;
    private int d;
    private int dp[][];
    private int minDifficultyAtIthJobDDay(int i,int day,int[] jobDifficulty)
    {
        int hardest=0,min=Integer.MAX_VALUE;
        
        if(dp[i][day]==-1){
        //If Last Day,Return HardestJob from Ith job to the last job
            if(day==d)
            {
                min=HardestRemainingJob[i];
            }
            else{
                for(int j=i;j<jobDifficulty.length-(d-day);j++)
                {
                    hardest=Math.max(hardest,jobDifficulty[j]);
                    min=Math.min(min,hardest+minDifficultyAtIthJobDDay(j+1,day+1,jobDifficulty));
                }
            }
            if(min!=Integer.MAX_VALUE)
                dp[i][day]=min;
        }
        return dp[i][day];
        
    }
    public int minDifficulty(int[] jobDifficulty, int d) {
       HardestRemainingJob=new int[jobDifficulty.length];
       dp=new int[jobDifficulty.length][d+1];
       int hard=0;
       this.d=d;
        //Storing Max Difficulty at ith job
        for(int i=jobDifficulty.length-1;i>=0;i--)
        {
            hard=Math.max(hard,jobDifficulty[i]);
            HardestRemainingJob[i]=hard;
        }
        for(int i=0;i<jobDifficulty.length;i++)
            Arrays.fill(dp[i],-1);
        return minDifficultyAtIthJobDDay(0,1,jobDifficulty);
        
    }
}