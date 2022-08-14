class Solution {
    private int[] nums;
    private List<List<Integer>> findPermutation(List<Integer> prevList)
    {
        List<Integer> newList;
        List<List<Integer>> list=new ArrayList<>();
        boolean allVisited=true;
        
        for(int i=0;i<nums.length;i++)
        {
            if(!prevList.contains(nums[i]))
            {
                allVisited=false;
                newList=new ArrayList<>();
                newList.addAll(prevList);
                newList.add(nums[i]);
                list.addAll(findPermutation(newList));
            }
        }
        if(allVisited)
        {
            list.add(prevList);
        }
        return list;
    }
    public List<List<Integer>> permute(int[] nums) {
        this.nums=nums;
        return findPermutation(new ArrayList<>());
        
    }
}