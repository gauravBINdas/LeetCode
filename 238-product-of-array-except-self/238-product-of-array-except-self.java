class Solution {
    public int[] productExceptSelf(int[] nums) {
        int answer[]=new int[nums.length];
        int prod=1;
        boolean aZero=false;
        boolean moreZero=false;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                prod*=nums[i];
            }
            else if(nums[i]==0 && !aZero)
            {
                aZero=true;
            }
            else if(nums[i]==0&&aZero)
            {
                moreZero=true;
                prod=0;
                break;
            }
        }
        
        
        for(int i=0;i<nums.length;i++)
        {
           if(moreZero)
           {
               answer[i]=0;
           }
           else if(aZero)
           {
               if(nums[i]==0)
                   answer[i]=prod;
               else
                   answer[i]=0;
           }
            else
            {
                answer[i]=prod/nums[i];
            }
        }
        
        return answer;
    }
}