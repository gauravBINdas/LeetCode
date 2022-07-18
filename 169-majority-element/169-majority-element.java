class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer,Integer> map=new HashMap<>();
       int max=0,major=nums[0]; 
      for(int i=0;i<nums.length;i++)
       {
           int curr=map.getOrDefault(nums[i],0)+1;
           if(curr>max){
               major=nums[i];
               max=curr;
           }
           map.put(nums[i],curr);
       }
        return major;
    }
}