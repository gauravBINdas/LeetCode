class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        
        int left=0,right=sum;
        int pivot=-1;
        for(int i=0;i<nums.length;i++)
        {
            right-=nums[i];
            if(left==right)
            {
                pivot=i;
                break;
            }
            left+=nums[i];
        }
        return pivot;
    }
}