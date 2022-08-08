class Solution {
    private int nums[];
    private Map<Integer,Integer> dp;
    private int maxSub(int curr,int prev)
    {
        if(!dp.containsKey(prev)){
            int max=0;    
            if(curr<nums.length){
                int prev_value=(prev>=0&&prev<nums.length)?nums[prev]:Integer.MIN_VALUE;
                max=(nums[curr]>prev_value)?1+maxSub(curr+1,curr):max;
                max=Math.max(max,maxSub(curr+1,prev));
            }
            dp.put(prev,max);
        }
        return dp.get(prev);
    }
    public int lengthOfLIS(int[] nums) {
        this.nums=nums;
        dp=new HashMap<>();
        return maxSub(0,-1);
    }
}