class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0],sum=nums[0];
        for(int i=1;i<nums.length;++i)
        {
            sum+=nums[i];
            sum=Math.max(sum,nums[i]);
            max=Math.max(max,sum);         
        }
        
        return max;
    }
}