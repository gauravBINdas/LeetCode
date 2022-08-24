class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        boolean startingFound=false,endingfound=false;
        while(i<=j && !(endingfound&&startingFound))
        {
            if(nums[i]!=target && !startingFound)
                i++;
            else
                startingFound=true;
            
            if(nums[j]!=target && !endingfound)
                j--;
            else
                endingfound=true;  
        }
        return (endingfound&&startingFound)?new int[]{i,j}:new int[]{-1,-1};
    }
}